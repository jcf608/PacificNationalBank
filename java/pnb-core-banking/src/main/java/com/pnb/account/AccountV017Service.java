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
 * AccountV017Service — Business logic for AccountV017 operations.
 */
@ApplicationScoped
public class AccountV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV017Service.class);

    @Inject
    private AccountV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV017> findById(Long id) {
        LOG.debug("Finding AccountV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV017 create(AccountV017 entity) {
        LOG.info("Creating AccountV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV017 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV017 update(Long id, AccountV017 entity) {
        LOG.info("Updating AccountV017 id: {}", id);
        AccountV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV017 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV017", id.toString());
    }
}
