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
 * DepositV002Service — Business logic for DepositV002 operations.
 */
@ApplicationScoped
public class DepositV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV002Service.class);

    @Inject
    private DepositV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV002> findById(Long id) {
        LOG.debug("Finding DepositV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV002 create(DepositV002 entity) {
        LOG.info("Creating DepositV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV002 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV002 update(Long id, DepositV002 entity) {
        LOG.info("Updating DepositV002 id: {}", id);
        DepositV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV002 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV002", id.toString());
    }
}
