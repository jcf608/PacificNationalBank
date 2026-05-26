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
 * DepositV035Service — Business logic for DepositV035 operations.
 */
@ApplicationScoped
public class DepositV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV035Service.class);

    @Inject
    private DepositV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV035> findById(Long id) {
        LOG.debug("Finding DepositV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV035 create(DepositV035 entity) {
        LOG.info("Creating DepositV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV035 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV035 update(Long id, DepositV035 entity) {
        LOG.info("Updating DepositV035 id: {}", id);
        DepositV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV035 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV035", id.toString());
    }
}
