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
 * DepositV010Service — Business logic for DepositV010 operations.
 */
@ApplicationScoped
public class DepositV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV010Service.class);

    @Inject
    private DepositV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV010> findById(Long id) {
        LOG.debug("Finding DepositV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV010 create(DepositV010 entity) {
        LOG.info("Creating DepositV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV010 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV010 update(Long id, DepositV010 entity) {
        LOG.info("Updating DepositV010 id: {}", id);
        DepositV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV010 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV010", id.toString());
    }
}
