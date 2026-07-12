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
 * DepositV020Service — Business logic for DepositV020 operations.
 */
@ApplicationScoped
public class DepositV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV020Service.class);

    @Inject
    private DepositV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV020> findById(Long id) {
        LOG.debug("Finding DepositV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV020 create(DepositV020 entity) {
        LOG.info("Creating DepositV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV020 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV020 update(Long id, DepositV020 entity) {
        LOG.info("Updating DepositV020 id: {}", id);
        DepositV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV020 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV020", id.toString());
    }
}
