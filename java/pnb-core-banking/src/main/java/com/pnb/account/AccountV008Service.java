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
 * AccountV008Service — Business logic for AccountV008 operations.
 */
@ApplicationScoped
public class AccountV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV008Service.class);

    @Inject
    private AccountV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV008> findById(Long id) {
        LOG.debug("Finding AccountV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV008 create(AccountV008 entity) {
        LOG.info("Creating AccountV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV008 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV008 update(Long id, AccountV008 entity) {
        LOG.info("Updating AccountV008 id: {}", id);
        AccountV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV008 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV008", id.toString());
    }
}
