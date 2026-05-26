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
 * AccountV022Service — Business logic for AccountV022 operations.
 */
@ApplicationScoped
public class AccountV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV022Service.class);

    @Inject
    private AccountV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV022> findById(Long id) {
        LOG.debug("Finding AccountV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV022 create(AccountV022 entity) {
        LOG.info("Creating AccountV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV022 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV022 update(Long id, AccountV022 entity) {
        LOG.info("Updating AccountV022 id: {}", id);
        AccountV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV022 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV022", id.toString());
    }
}
