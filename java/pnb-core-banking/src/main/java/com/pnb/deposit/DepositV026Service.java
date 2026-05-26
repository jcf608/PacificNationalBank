package com.pnb.deposit;

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
 * DepositV026Service — Business logic for DepositV026 operations.
 */
@ApplicationScoped
public class DepositV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV026Service.class);

    @Inject
    private DepositV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV026> findById(Long id) {
        LOG.debug("Finding DepositV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV026 create(DepositV026 entity) {
        LOG.info("Creating DepositV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV026 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV026 update(Long id, DepositV026 entity) {
        LOG.info("Updating DepositV026 id: {}", id);
        DepositV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV026 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV026", id.toString());
    }
}
