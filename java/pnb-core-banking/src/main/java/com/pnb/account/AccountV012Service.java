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
 * AccountV012Service — Business logic for AccountV012 operations.
 */
@ApplicationScoped
public class AccountV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV012Service.class);

    @Inject
    private AccountV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV012> findById(Long id) {
        LOG.debug("Finding AccountV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV012 create(AccountV012 entity) {
        LOG.info("Creating AccountV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV012 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV012 update(Long id, AccountV012 entity) {
        LOG.info("Updating AccountV012 id: {}", id);
        AccountV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV012 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV012", id.toString());
    }
}
