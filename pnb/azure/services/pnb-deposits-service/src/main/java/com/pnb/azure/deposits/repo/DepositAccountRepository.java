package com.pnb.azure.deposits.repo;

import com.pnb.azure.deposits.domain.DepositAccount;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositAccountRepository extends JpaRepository<DepositAccount, String> {
    List<DepositAccount> findByCustomerId(String customerId);

    Optional<DepositAccount> findByLegacyPnbAccountKey(String legacyPnbAccountKey);

    Optional<DepositAccount> findByReconciledAcbAccountKey(String reconciledAcbAccountKey);
}
