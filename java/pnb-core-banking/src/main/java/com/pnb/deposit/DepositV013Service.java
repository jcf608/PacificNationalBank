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
 * DepositV013Service — Business logic for DepositV013 operations.
 */
@ApplicationScoped
public class DepositV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV013Service.class);

    @Inject
    private DepositV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV013> findById(Long id) {
        LOG.debug("Finding DepositV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV013 create(DepositV013 entity) {
        LOG.info("Creating DepositV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV013 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV013 update(Long id, DepositV013 entity) {
        LOG.info("Updating DepositV013 id: {}", id);
        DepositV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV013 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV013", id.toString());
    }
}
