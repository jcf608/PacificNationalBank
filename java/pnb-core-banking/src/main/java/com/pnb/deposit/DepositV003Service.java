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
 * DepositV003Service — Business logic for DepositV003 operations.
 */
@ApplicationScoped
public class DepositV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV003Service.class);

    @Inject
    private DepositV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV003> findById(Long id) {
        LOG.debug("Finding DepositV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV003 create(DepositV003 entity) {
        LOG.info("Creating DepositV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV003 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV003 update(Long id, DepositV003 entity) {
        LOG.info("Updating DepositV003 id: {}", id);
        DepositV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV003 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV003", id.toString());
    }
}
