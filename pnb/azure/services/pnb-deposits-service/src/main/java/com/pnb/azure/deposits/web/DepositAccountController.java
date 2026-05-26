package com.pnb.azure.deposits.web;

import com.pnb.azure.deposits.domain.DepositAccount;
import com.pnb.azure.deposits.repo.DepositAccountRepository;
import com.pnb.azure.deposits.service.DepositPostingService;
import com.pnb.azure.deposits.web.dto.PostingRequest;
import com.pnb.azure.deposits.web.dto.PostingResult;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/pnb/deposits")
public class DepositAccountController {

    private final DepositAccountRepository repository;
    private final DepositPostingService postingService;

    public DepositAccountController(
            DepositAccountRepository repository, DepositPostingService postingService) {
        this.repository = repository;
        this.postingService = postingService;
    }

    @GetMapping("/accounts/{accountNumber}")
    public DepositAccount getAccount(@PathVariable String accountNumber) {
        return repository
                .findById(accountNumber)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Account not found"));
    }

    @GetMapping("/customers/{customerId}/accounts")
    public List<DepositAccount> listByCustomer(@PathVariable String customerId) {
        return repository.findByCustomerId(customerId);
    }

    @PostMapping("/accounts/{accountNumber}/postings")
    @ResponseStatus(HttpStatus.CREATED)
    public PostingResult post(
            @PathVariable String accountNumber, @Valid @RequestBody PostingRequest request) {
        return postingService.post(accountNumber, request);
    }
}
