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
 * AccountV018Service — Business logic for AccountV018 operations.
 */
@ApplicationScoped
public class AccountV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV018Service.class);

    @Inject
    private AccountV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV018> findById(Long id) {
        LOG.debug("Finding AccountV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV018 create(AccountV018 entity) {
        LOG.info("Creating AccountV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV018 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV018 update(Long id, AccountV018 entity) {
        LOG.info("Updating AccountV018 id: {}", id);
        AccountV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV018 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV018", id.toString());
    }
}
