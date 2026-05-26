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
 * AccountV037Service — Business logic for AccountV037 operations.
 */
@ApplicationScoped
public class AccountV037Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV037Service.class);

    @Inject
    private AccountV037Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV037> findById(Long id) {
        LOG.debug("Finding AccountV037 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV037> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV037 create(AccountV037 entity) {
        LOG.info("Creating AccountV037");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV037 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV037", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV037 update(Long id, AccountV037 entity) {
        LOG.info("Updating AccountV037 id: {}", id);
        AccountV037 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV037 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV037 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV037", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV037 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV037", id.toString());
    }
}
