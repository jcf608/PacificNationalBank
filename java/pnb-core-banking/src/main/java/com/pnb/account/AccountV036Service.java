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
 * AccountV036Service — Business logic for AccountV036 operations.
 */
@ApplicationScoped
public class AccountV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV036Service.class);

    @Inject
    private AccountV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV036> findById(Long id) {
        LOG.debug("Finding AccountV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV036 create(AccountV036 entity) {
        LOG.info("Creating AccountV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV036 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV036 update(Long id, AccountV036 entity) {
        LOG.info("Updating AccountV036 id: {}", id);
        AccountV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV036 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV036", id.toString());
    }
}
