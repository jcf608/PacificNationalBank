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
 * DepositV034Service — Business logic for DepositV034 operations.
 */
@ApplicationScoped
public class DepositV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV034Service.class);

    @Inject
    private DepositV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV034> findById(Long id) {
        LOG.debug("Finding DepositV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV034 create(DepositV034 entity) {
        LOG.info("Creating DepositV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV034 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV034 update(Long id, DepositV034 entity) {
        LOG.info("Updating DepositV034 id: {}", id);
        DepositV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV034 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV034", id.toString());
    }
}
