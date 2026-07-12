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
 * DepositV021Service — Business logic for DepositV021 operations.
 */
@ApplicationScoped
public class DepositV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV021Service.class);

    @Inject
    private DepositV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV021> findById(Long id) {
        LOG.debug("Finding DepositV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV021 create(DepositV021 entity) {
        LOG.info("Creating DepositV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV021 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV021 update(Long id, DepositV021 entity) {
        LOG.info("Updating DepositV021 id: {}", id);
        DepositV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV021 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV021", id.toString());
    }
}
