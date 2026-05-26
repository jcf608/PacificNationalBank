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
 * AccountV024Service — Business logic for AccountV024 operations.
 */
@ApplicationScoped
public class AccountV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV024Service.class);

    @Inject
    private AccountV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV024> findById(Long id) {
        LOG.debug("Finding AccountV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV024 create(AccountV024 entity) {
        LOG.info("Creating AccountV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV024 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV024 update(Long id, AccountV024 entity) {
        LOG.info("Updating AccountV024 id: {}", id);
        AccountV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV024 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV024", id.toString());
    }
}
