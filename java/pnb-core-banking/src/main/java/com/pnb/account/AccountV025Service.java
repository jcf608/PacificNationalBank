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
 * AccountV025Service — Business logic for AccountV025 operations.
 */
@ApplicationScoped
public class AccountV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV025Service.class);

    @Inject
    private AccountV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV025> findById(Long id) {
        LOG.debug("Finding AccountV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV025 create(AccountV025 entity) {
        LOG.info("Creating AccountV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV025 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV025 update(Long id, AccountV025 entity) {
        LOG.info("Updating AccountV025 id: {}", id);
        AccountV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV025 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV025", id.toString());
    }
}
