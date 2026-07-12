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
 * DepositV039Service — Business logic for DepositV039 operations.
 */
@ApplicationScoped
public class DepositV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV039Service.class);

    @Inject
    private DepositV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV039> findById(Long id) {
        LOG.debug("Finding DepositV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV039 create(DepositV039 entity) {
        LOG.info("Creating DepositV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV039 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV039 update(Long id, DepositV039 entity) {
        LOG.info("Updating DepositV039 id: {}", id);
        DepositV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV039 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV039", id.toString());
    }
}
