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
 * AccountV009Service — Business logic for AccountV009 operations.
 */
@ApplicationScoped
public class AccountV009Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV009Service.class);

    @Inject
    private AccountV009Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV009> findById(Long id) {
        LOG.debug("Finding AccountV009 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV009> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV009 create(AccountV009 entity) {
        LOG.info("Creating AccountV009");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV009 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV009", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV009 update(Long id, AccountV009 entity) {
        LOG.info("Updating AccountV009 id: {}", id);
        AccountV009 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV009 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV009 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV009", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV009 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV009", id.toString());
    }
}
