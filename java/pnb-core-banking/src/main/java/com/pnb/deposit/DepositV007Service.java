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
 * DepositV007Service — Business logic for DepositV007 operations.
 */
@ApplicationScoped
public class DepositV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV007Service.class);

    @Inject
    private DepositV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV007> findById(Long id) {
        LOG.debug("Finding DepositV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV007 create(DepositV007 entity) {
        LOG.info("Creating DepositV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV007 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV007 update(Long id, DepositV007 entity) {
        LOG.info("Updating DepositV007 id: {}", id);
        DepositV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV007 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV007", id.toString());
    }
}
