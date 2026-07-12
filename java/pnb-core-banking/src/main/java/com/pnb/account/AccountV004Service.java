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
 * AccountV004Service — Business logic for AccountV004 operations.
 */
@ApplicationScoped
public class AccountV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV004Service.class);

    @Inject
    private AccountV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV004> findById(Long id) {
        LOG.debug("Finding AccountV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV004 create(AccountV004 entity) {
        LOG.info("Creating AccountV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV004 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV004 update(Long id, AccountV004 entity) {
        LOG.info("Updating AccountV004 id: {}", id);
        AccountV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV004 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV004", id.toString());
    }
}
