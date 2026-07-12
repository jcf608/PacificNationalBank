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
 * DepositV029Service — Business logic for DepositV029 operations.
 */
@ApplicationScoped
public class DepositV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV029Service.class);

    @Inject
    private DepositV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV029> findById(Long id) {
        LOG.debug("Finding DepositV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV029 create(DepositV029 entity) {
        LOG.info("Creating DepositV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV029 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV029 update(Long id, DepositV029 entity) {
        LOG.info("Updating DepositV029 id: {}", id);
        DepositV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV029 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV029", id.toString());
    }
}
