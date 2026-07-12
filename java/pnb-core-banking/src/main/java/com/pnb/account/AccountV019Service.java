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
 * AccountV019Service — Business logic for AccountV019 operations.
 */
@ApplicationScoped
public class AccountV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(AccountV019Service.class);

    @Inject
    private AccountV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AccountV019> findById(Long id) {
        LOG.debug("Finding AccountV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<AccountV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AccountV019 create(AccountV019 entity) {
        LOG.info("Creating AccountV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV019 saved = repository.save(entity);
        auditService.log("CREATE", "AccountV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AccountV019 update(Long id, AccountV019 entity) {
        LOG.info("Updating AccountV019 id: {}", id);
        AccountV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AccountV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AccountV019 updated = repository.save(entity);
        auditService.log("UPDATE", "AccountV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AccountV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AccountV019", id.toString());
    }
}
