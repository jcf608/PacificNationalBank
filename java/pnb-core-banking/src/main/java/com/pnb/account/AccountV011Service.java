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
 * AccountV011Service — Business logic for AccountV011 operations.
 */
@ApplicationScoped
public class AccountV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV011Service.class);

    @Inject
    private AccountV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV011> findById(Long id) {
        LOG.debug("Finding AccountV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV011 create(AccountV011 entity) {
        LOG.info("Creating AccountV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV011 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV011 update(Long id, AccountV011 entity) {
        LOG.info("Updating AccountV011 id: {}", id);
        AccountV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV011 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV011", id.toString());
    }
}
