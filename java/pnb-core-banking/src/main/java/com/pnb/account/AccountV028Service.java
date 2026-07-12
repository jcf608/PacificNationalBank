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
 * AccountV028Service — Business logic for AccountV028 operations.
 */
@ApplicationScoped
public class AccountV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV028Service.class);

    @Inject
    private AccountV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV028> findById(Long id) {
        LOG.debug("Finding AccountV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV028 create(AccountV028 entity) {
        LOG.info("Creating AccountV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV028 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV028 update(Long id, AccountV028 entity) {
        LOG.info("Updating AccountV028 id: {}", id);
        AccountV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV028 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV028", id.toString());
    }
}
