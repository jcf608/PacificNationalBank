package com.pnb.azure.deposits.service;

import com.pnb.azure.deposits.domain.DepositAccount;
import com.pnb.azure.deposits.repo.DepositAccountRepository;
import com.pnb.azure.deposits.web.dto.PostingRequest;
import com.pnb.azure.deposits.web.dto.PostingResult;
import jakarta.transaction.Transactional;
import java.math.BigDecimal;
import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DepositPostingService {

    private final DepositAccountRepository repository;
    private final MergerEventPublisher mergerEventPublisher;

    public DepositPostingService(
            DepositAccountRepository repository, MergerEventPublisher mergerEventPublisher) {
        this.repository = repository;
        this.mergerEventPublisher = mergerEventPublisher;
    }

    @Transactional
    public PostingResult post(String accountNumber, PostingRequest request) {
        DepositAccount account =
                repository
                        .findById(accountNumber)
                        .orElseThrow(
                                () ->
                                        new ResponseStatusException(
                                                HttpStatus.NOT_FOUND, "PNB account not found"));

        if (!"A".equals(account.getStatus())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Account not active");
        }

        BigDecimal amount = request.amount();
        if (amount.signum() == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Amount must be non-zero");
        }

        BigDecimal newLedger = account.getLedgerBalance().add(amount);
        if (newLedger.compareTo(BigDecimal.ZERO) < 0
                && account.getAvailableBalance().add(amount).compareTo(BigDecimal.ZERO) < 0) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Insufficient funds");
        }

        account.setLedgerBalance(newLedger);
        account.setAvailableBalance(account.getAvailableBalance().add(amount));
        account.setLastPostedAt(Instant.now());
        repository.save(account);

        mergerEventPublisher.publishBalanceChange(account, request);

        return new PostingResult(
                account.getAccountNumber(),
                request.transactionId(),
                newLedger,
                account.getAvailableBalance(),
                "POSTED",
                Instant.now());
    }
}
