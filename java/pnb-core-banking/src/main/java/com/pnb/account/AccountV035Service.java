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
 * AccountV035Service — Business logic for AccountV035 operations.
 */
@ApplicationScoped
public class AccountV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV035Service.class);

    @Inject
    private AccountV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV035> findById(Long id) {
        LOG.debug("Finding AccountV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV035 create(AccountV035 entity) {
        LOG.info("Creating AccountV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV035 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV035 update(Long id, AccountV035 entity) {
        LOG.info("Updating AccountV035 id: {}", id);
        AccountV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV035 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV035", id.toString());
    }
}
