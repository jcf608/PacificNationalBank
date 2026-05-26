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
 * DepositV018Service — Business logic for DepositV018 operations.
 */
@ApplicationScoped
public class DepositV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV018Service.class);

    @Inject
    private DepositV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV018> findById(Long id) {
        LOG.debug("Finding DepositV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV018 create(DepositV018 entity) {
        LOG.info("Creating DepositV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV018 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV018 update(Long id, DepositV018 entity) {
        LOG.info("Updating DepositV018 id: {}", id);
        DepositV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV018 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV018", id.toString());
    }
}
