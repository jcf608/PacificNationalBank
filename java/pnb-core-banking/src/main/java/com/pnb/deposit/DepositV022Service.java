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
 * DepositV022Service — Business logic for DepositV022 operations.
 */
@ApplicationScoped
public class DepositV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV022Service.class);

    @Inject
    private DepositV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV022> findById(Long id) {
        LOG.debug("Finding DepositV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV022 create(DepositV022 entity) {
        LOG.info("Creating DepositV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV022 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV022 update(Long id, DepositV022 entity) {
        LOG.info("Updating DepositV022 id: {}", id);
        DepositV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV022 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV022", id.toString());
    }
}
