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
 * DepositV030Service — Business logic for DepositV030 operations.
 */
@ApplicationScoped
public class DepositV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV030Service.class);

    @Inject
    private DepositV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV030> findById(Long id) {
        LOG.debug("Finding DepositV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV030 create(DepositV030 entity) {
        LOG.info("Creating DepositV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV030 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV030 update(Long id, DepositV030 entity) {
        LOG.info("Updating DepositV030 id: {}", id);
        DepositV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV030 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV030", id.toString());
    }
}
