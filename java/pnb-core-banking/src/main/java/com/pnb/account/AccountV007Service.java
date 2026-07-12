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
 * AccountV007Service — Business logic for AccountV007 operations.
 */
@ApplicationScoped
public class AccountV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV007Service.class);

    @Inject
    private AccountV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV007> findById(Long id) {
        LOG.debug("Finding AccountV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV007 create(AccountV007 entity) {
        LOG.info("Creating AccountV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV007 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV007 update(Long id, AccountV007 entity) {
        LOG.info("Updating AccountV007 id: {}", id);
        AccountV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV007 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV007", id.toString());
    }
}
