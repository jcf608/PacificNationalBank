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
 * AccountV026Service — Business logic for AccountV026 operations.
 */
@ApplicationScoped
public class AccountV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV026Service.class);

    @Inject
    private AccountV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV026> findById(Long id) {
        LOG.debug("Finding AccountV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV026 create(AccountV026 entity) {
        LOG.info("Creating AccountV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV026 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV026 update(Long id, AccountV026 entity) {
        LOG.info("Updating AccountV026 id: {}", id);
        AccountV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV026 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV026", id.toString());
    }
}
