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
 * AccountV030Service — Business logic for AccountV030 operations.
 */
@ApplicationScoped
public class AccountV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV030Service.class);

    @Inject
    private AccountV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV030> findById(Long id) {
        LOG.debug("Finding AccountV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV030 create(AccountV030 entity) {
        LOG.info("Creating AccountV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV030 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV030 update(Long id, AccountV030 entity) {
        LOG.info("Updating AccountV030 id: {}", id);
        AccountV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV030 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV030", id.toString());
    }
}
