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
 * AccountV006Service — Business logic for AccountV006 operations.
 */
@ApplicationScoped
public class AccountV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV006Service.class);

    @Inject
    private AccountV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV006> findById(Long id) {
        LOG.debug("Finding AccountV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV006 create(AccountV006 entity) {
        LOG.info("Creating AccountV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV006 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV006 update(Long id, AccountV006 entity) {
        LOG.info("Updating AccountV006 id: {}", id);
        AccountV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV006 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV006", id.toString());
    }
}
