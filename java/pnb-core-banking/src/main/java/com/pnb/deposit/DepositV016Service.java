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
 * DepositV016Service — Business logic for DepositV016 operations.
 */
@ApplicationScoped
public class DepositV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV016Service.class);

    @Inject
    private DepositV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV016> findById(Long id) {
        LOG.debug("Finding DepositV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV016 create(DepositV016 entity) {
        LOG.info("Creating DepositV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV016 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV016 update(Long id, DepositV016 entity) {
        LOG.info("Updating DepositV016 id: {}", id);
        DepositV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV016 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV016", id.toString());
    }
}
