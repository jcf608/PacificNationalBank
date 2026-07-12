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
 * AccountV014Service — Business logic for AccountV014 operations.
 */
@ApplicationScoped
public class AccountV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV014Service.class);

    @Inject
    private AccountV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV014> findById(Long id) {
        LOG.debug("Finding AccountV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV014 create(AccountV014 entity) {
        LOG.info("Creating AccountV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV014 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV014 update(Long id, AccountV014 entity) {
        LOG.info("Updating AccountV014 id: {}", id);
        AccountV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV014 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV014", id.toString());
    }
}
