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
 * DepositV032Service — Business logic for DepositV032 operations.
 */
@ApplicationScoped
public class DepositV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV032Service.class);

    @Inject
    private DepositV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV032> findById(Long id) {
        LOG.debug("Finding DepositV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV032 create(DepositV032 entity) {
        LOG.info("Creating DepositV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV032 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV032 update(Long id, DepositV032 entity) {
        LOG.info("Updating DepositV032 id: {}", id);
        DepositV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV032 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV032", id.toString());
    }
}
