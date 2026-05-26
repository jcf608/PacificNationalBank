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
 * AccountV020Service — Business logic for AccountV020 operations.
 */
@ApplicationScoped
public class AccountV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV020Service.class);

    @Inject
    private AccountV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV020> findById(Long id) {
        LOG.debug("Finding AccountV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV020 create(AccountV020 entity) {
        LOG.info("Creating AccountV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV020 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV020 update(Long id, AccountV020 entity) {
        LOG.info("Updating AccountV020 id: {}", id);
        AccountV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV020 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV020", id.toString());
    }
}
