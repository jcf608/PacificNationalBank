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
 * DepositV004Service — Business logic for DepositV004 operations.
 */
@ApplicationScoped
public class DepositV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV004Service.class);

    @Inject
    private DepositV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV004> findById(Long id) {
        LOG.debug("Finding DepositV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV004 create(DepositV004 entity) {
        LOG.info("Creating DepositV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV004 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV004 update(Long id, DepositV004 entity) {
        LOG.info("Updating DepositV004 id: {}", id);
        DepositV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV004 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV004", id.toString());
    }
}
