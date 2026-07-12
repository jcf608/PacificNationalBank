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
 * AccountV003Service — Business logic for AccountV003 operations.
 */
@ApplicationScoped
public class AccountV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV003Service.class);

    @Inject
    private AccountV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV003> findById(Long id) {
        LOG.debug("Finding AccountV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV003 create(AccountV003 entity) {
        LOG.info("Creating AccountV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV003 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV003 update(Long id, AccountV003 entity) {
        LOG.info("Updating AccountV003 id: {}", id);
        AccountV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV003 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV003", id.toString());
    }
}
