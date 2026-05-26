package com.pnb.azure.deposits;

import com.pnb.azure.deposits.domain.DepositAccount;
import com.pnb.azure.deposits.repo.DepositAccountRepository;
import com.pnb.azure.deposits.service.DepositPostingService;
import com.pnb.azure.deposits.service.MergerEventPublisher;
import com.pnb.azure.deposits.web.dto.PostingRequest;
import java.math.BigDecimal;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DepositPostingServiceTest {

    @Mock private DepositAccountRepository repository;
    @Mock private MergerEventPublisher mergerEventPublisher;

    private DepositPostingService service;

    @BeforeEach
    void setUp() {
        service = new DepositPostingService(repository, mergerEventPublisher);
    }

    @Test
    void postsCreditAndUpdatesBalances() {
        DepositAccount account = new DepositAccount();
        account.setAccountNumber("0000000000000001");
        account.setStatus("A");
        account.setLedgerBalance(new BigDecimal("100.00"));
        account.setAvailableBalance(new BigDecimal("100.00"));
        when(repository.findById("0000000000000001")).thenReturn(Optional.of(account));
        when(repository.save(any())).thenAnswer(inv -> inv.getArgument(0));

        var result =
                service.post(
                        "0000000000000001",
                        new PostingRequest("TXN-1", new BigDecimal("25.50"), "ONLINE", "test"));

        assertThat(result.status()).isEqualTo("POSTED");
        assertThat(result.ledgerBalance()).isEqualByComparingTo("125.50");
        verify(mergerEventPublisher).publishBalanceChange(any(), any());
    }
}
