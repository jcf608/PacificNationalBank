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
 * AccountV039Service — Business logic for AccountV039 operations.
 */
@ApplicationScoped
public class AccountV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV039Service.class);

    @Inject
    private AccountV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV039> findById(Long id) {
        LOG.debug("Finding AccountV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV039 create(AccountV039 entity) {
        LOG.info("Creating AccountV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV039 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV039 update(Long id, AccountV039 entity) {
        LOG.info("Updating AccountV039 id: {}", id);
        AccountV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV039 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV039", id.toString());
    }
}
