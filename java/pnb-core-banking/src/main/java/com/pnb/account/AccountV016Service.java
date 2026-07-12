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
 * AccountV016Service — Business logic for AccountV016 operations.
 */
@ApplicationScoped
public class AccountV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV016Service.class);

    @Inject
    private AccountV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV016> findById(Long id) {
        LOG.debug("Finding AccountV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV016 create(AccountV016 entity) {
        LOG.info("Creating AccountV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV016 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV016 update(Long id, AccountV016 entity) {
        LOG.info("Updating AccountV016 id: {}", id);
        AccountV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV016 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV016", id.toString());
    }
}
