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
 * DepositV000Service — Business logic for DepositV000 operations.
 */
@ApplicationScoped
public class DepositV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV000Service.class);

    @Inject
    private DepositV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV000> findById(Long id) {
        LOG.debug("Finding DepositV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV000 create(DepositV000 entity) {
        LOG.info("Creating DepositV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV000 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV000 update(Long id, DepositV000 entity) {
        LOG.info("Updating DepositV000 id: {}", id);
        DepositV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV000 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV000", id.toString());
    }
}
