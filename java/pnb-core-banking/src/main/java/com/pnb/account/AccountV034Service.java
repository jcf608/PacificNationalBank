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
 * AccountV034Service — Business logic for AccountV034 operations.
 */
@ApplicationScoped
public class AccountV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV034Service.class);

    @Inject
    private AccountV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV034> findById(Long id) {
        LOG.debug("Finding AccountV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV034 create(AccountV034 entity) {
        LOG.info("Creating AccountV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV034 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV034 update(Long id, AccountV034 entity) {
        LOG.info("Updating AccountV034 id: {}", id);
        AccountV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV034 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV034", id.toString());
    }
}
