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
 * DepositV027Service — Business logic for DepositV027 operations.
 */
@ApplicationScoped
public class DepositV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV027Service.class);

    @Inject
    private DepositV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV027> findById(Long id) {
        LOG.debug("Finding DepositV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV027 create(DepositV027 entity) {
        LOG.info("Creating DepositV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV027 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV027 update(Long id, DepositV027 entity) {
        LOG.info("Updating DepositV027 id: {}", id);
        DepositV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV027 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV027", id.toString());
    }
}
