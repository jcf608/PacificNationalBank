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
 * AccountV010Service — Business logic for AccountV010 operations.
 */
@ApplicationScoped
public class AccountV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV010Service.class);

    @Inject
    private AccountV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV010> findById(Long id) {
        LOG.debug("Finding AccountV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV010 create(AccountV010 entity) {
        LOG.info("Creating AccountV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV010 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV010 update(Long id, AccountV010 entity) {
        LOG.info("Updating AccountV010 id: {}", id);
        AccountV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV010 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV010", id.toString());
    }
}
