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
 * AccountV013Service — Business logic for AccountV013 operations.
 */
@ApplicationScoped
public class AccountV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV013Service.class);

    @Inject
    private AccountV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV013> findById(Long id) {
        LOG.debug("Finding AccountV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV013 create(AccountV013 entity) {
        LOG.info("Creating AccountV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV013 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV013 update(Long id, AccountV013 entity) {
        LOG.info("Updating AccountV013 id: {}", id);
        AccountV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV013 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV013", id.toString());
    }
}
