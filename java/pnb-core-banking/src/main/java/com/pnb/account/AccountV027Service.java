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
 * AccountV027Service — Business logic for AccountV027 operations.
 */
@ApplicationScoped
public class AccountV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV027Service.class);

    @Inject
    private AccountV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV027> findById(Long id) {
        LOG.debug("Finding AccountV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV027 create(AccountV027 entity) {
        LOG.info("Creating AccountV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV027 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV027 update(Long id, AccountV027 entity) {
        LOG.info("Updating AccountV027 id: {}", id);
        AccountV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV027 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV027", id.toString());
    }
}
