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
 * AccountV000Service — Business logic for AccountV000 operations.
 */
@ApplicationScoped
public class AccountV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV000Service.class);

    @Inject
    private AccountV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV000> findById(Long id) {
        LOG.debug("Finding AccountV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV000 create(AccountV000 entity) {
        LOG.info("Creating AccountV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV000 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV000 update(Long id, AccountV000 entity) {
        LOG.info("Updating AccountV000 id: {}", id);
        AccountV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV000 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV000", id.toString());
    }
}
