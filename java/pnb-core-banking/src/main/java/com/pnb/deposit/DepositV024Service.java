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
 * DepositV024Service — Business logic for DepositV024 operations.
 */
@ApplicationScoped
public class DepositV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV024Service.class);

    @Inject
    private DepositV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV024> findById(Long id) {
        LOG.debug("Finding DepositV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV024 create(DepositV024 entity) {
        LOG.info("Creating DepositV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV024 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV024 update(Long id, DepositV024 entity) {
        LOG.info("Updating DepositV024 id: {}", id);
        DepositV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV024 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV024", id.toString());
    }
}
