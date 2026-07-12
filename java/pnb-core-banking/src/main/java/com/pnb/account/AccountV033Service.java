package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AccountV033Service — Business logic for AccountV033 operations.
 */
@ApplicationScoped
public class AccountV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV033Service.class);

    @Inject
    private AccountV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV033> findById(Long id) {
        LOG.debug("Finding AccountV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV033 create(AccountV033 entity) {
        LOG.info("Creating AccountV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV033 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV033 update(Long id, AccountV033 entity) {
        LOG.info("Updating AccountV033 id: {}", id);
        AccountV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV033 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV033", id.toString());
    }
}
