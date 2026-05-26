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
 * AccountV038Service — Business logic for AccountV038 operations.
 */
@ApplicationScoped
public class AccountV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV038Service.class);

    @Inject
    private AccountV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV038> findById(Long id) {
        LOG.debug("Finding AccountV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV038 create(AccountV038 entity) {
        LOG.info("Creating AccountV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV038 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV038 update(Long id, AccountV038 entity) {
        LOG.info("Updating AccountV038 id: {}", id);
        AccountV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV038 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV038", id.toString());
    }
}
