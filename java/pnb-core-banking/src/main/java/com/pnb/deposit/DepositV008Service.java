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
 * DepositV008Service — Business logic for DepositV008 operations.
 */
@ApplicationScoped
public class DepositV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV008Service.class);

    @Inject
    private DepositV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV008> findById(Long id) {
        LOG.debug("Finding DepositV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV008 create(DepositV008 entity) {
        LOG.info("Creating DepositV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV008 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV008 update(Long id, DepositV008 entity) {
        LOG.info("Updating DepositV008 id: {}", id);
        DepositV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV008 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV008", id.toString());
    }
}
