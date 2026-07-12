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
 * DepositV014Service — Business logic for DepositV014 operations.
 */
@ApplicationScoped
public class DepositV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV014Service.class);

    @Inject
    private DepositV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV014> findById(Long id) {
        LOG.debug("Finding DepositV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV014 create(DepositV014 entity) {
        LOG.info("Creating DepositV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV014 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV014 update(Long id, DepositV014 entity) {
        LOG.info("Updating DepositV014 id: {}", id);
        DepositV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV014 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV014", id.toString());
    }
}
