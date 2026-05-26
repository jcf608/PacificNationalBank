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
 * DepositV001Service — Business logic for DepositV001 operations.
 */
@ApplicationScoped
public class DepositV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV001Service.class);

    @Inject
    private DepositV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV001> findById(Long id) {
        LOG.debug("Finding DepositV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV001 create(DepositV001 entity) {
        LOG.info("Creating DepositV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV001 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV001 update(Long id, DepositV001 entity) {
        LOG.info("Updating DepositV001 id: {}", id);
        DepositV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV001 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV001", id.toString());
    }
}
