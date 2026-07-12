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
 * DepositV025Service — Business logic for DepositV025 operations.
 */
@ApplicationScoped
public class DepositV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV025Service.class);

    @Inject
    private DepositV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV025> findById(Long id) {
        LOG.debug("Finding DepositV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV025 create(DepositV025 entity) {
        LOG.info("Creating DepositV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV025 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV025 update(Long id, DepositV025 entity) {
        LOG.info("Updating DepositV025 id: {}", id);
        DepositV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV025 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV025", id.toString());
    }
}
