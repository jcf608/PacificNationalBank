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
 * AccountV001Service — Business logic for AccountV001 operations.
 */
@ApplicationScoped
public class AccountV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV001Service.class);

    @Inject
    private AccountV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV001> findById(Long id) {
        LOG.debug("Finding AccountV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV001 create(AccountV001 entity) {
        LOG.info("Creating AccountV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV001 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV001 update(Long id, AccountV001 entity) {
        LOG.info("Updating AccountV001 id: {}", id);
        AccountV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV001 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV001", id.toString());
    }
}
