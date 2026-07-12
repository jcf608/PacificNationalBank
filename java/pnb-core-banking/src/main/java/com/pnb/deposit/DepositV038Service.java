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
 * DepositV038Service — Business logic for DepositV038 operations.
 */
@ApplicationScoped
public class DepositV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV038Service.class);

    @Inject
    private DepositV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV038> findById(Long id) {
        LOG.debug("Finding DepositV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV038 create(DepositV038 entity) {
        LOG.info("Creating DepositV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV038 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV038 update(Long id, DepositV038 entity) {
        LOG.info("Updating DepositV038 id: {}", id);
        DepositV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV038 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV038", id.toString());
    }
}
