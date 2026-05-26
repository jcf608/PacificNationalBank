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
 * DepositV023Service — Business logic for DepositV023 operations.
 */
@ApplicationScoped
public class DepositV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV023Service.class);

    @Inject
    private DepositV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV023> findById(Long id) {
        LOG.debug("Finding DepositV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV023 create(DepositV023 entity) {
        LOG.info("Creating DepositV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV023 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV023 update(Long id, DepositV023 entity) {
        LOG.info("Updating DepositV023 id: {}", id);
        DepositV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV023 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV023", id.toString());
    }
}
