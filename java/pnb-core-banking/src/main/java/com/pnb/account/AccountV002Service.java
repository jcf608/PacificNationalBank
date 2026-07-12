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
 * AccountV002Service — Business logic for AccountV002 operations.
 */
@ApplicationScoped
public class AccountV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV002Service.class);

    @Inject
    private AccountV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV002> findById(Long id) {
        LOG.debug("Finding AccountV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV002 create(AccountV002 entity) {
        LOG.info("Creating AccountV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV002 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV002 update(Long id, AccountV002 entity) {
        LOG.info("Updating AccountV002 id: {}", id);
        AccountV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV002 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV002", id.toString());
    }
}
