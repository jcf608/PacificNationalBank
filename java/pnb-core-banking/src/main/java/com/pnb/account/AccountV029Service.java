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
 * AccountV029Service — Business logic for AccountV029 operations.
 */
@ApplicationScoped
public class AccountV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV029Service.class);

    @Inject
    private AccountV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV029> findById(Long id) {
        LOG.debug("Finding AccountV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV029 create(AccountV029 entity) {
        LOG.info("Creating AccountV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV029 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV029 update(Long id, AccountV029 entity) {
        LOG.info("Updating AccountV029 id: {}", id);
        AccountV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV029 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV029", id.toString());
    }
}
