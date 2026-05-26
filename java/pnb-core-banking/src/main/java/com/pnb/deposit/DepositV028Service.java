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
 * DepositV028Service — Business logic for DepositV028 operations.
 */
@ApplicationScoped
public class DepositV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV028Service.class);

    @Inject
    private DepositV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV028> findById(Long id) {
        LOG.debug("Finding DepositV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV028 create(DepositV028 entity) {
        LOG.info("Creating DepositV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV028 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV028 update(Long id, DepositV028 entity) {
        LOG.info("Updating DepositV028 id: {}", id);
        DepositV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV028 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV028", id.toString());
    }
}
