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
 * AccountV031Service — Business logic for AccountV031 operations.
 */
@ApplicationScoped
public class AccountV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV031Service.class);

    @Inject
    private AccountV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV031> findById(Long id) {
        LOG.debug("Finding AccountV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV031 create(AccountV031 entity) {
        LOG.info("Creating AccountV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV031 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV031 update(Long id, AccountV031 entity) {
        LOG.info("Updating AccountV031 id: {}", id);
        AccountV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV031 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV031", id.toString());
    }
}
