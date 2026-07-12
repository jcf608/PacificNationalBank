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
 * AccountV021Service — Business logic for AccountV021 operations.
 */
@ApplicationScoped
public class AccountV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV021Service.class);

    @Inject
    private AccountV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV021> findById(Long id) {
        LOG.debug("Finding AccountV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV021 create(AccountV021 entity) {
        LOG.info("Creating AccountV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV021 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV021 update(Long id, AccountV021 entity) {
        LOG.info("Updating AccountV021 id: {}", id);
        AccountV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV021 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV021", id.toString());
    }
}
