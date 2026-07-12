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
 * DepositV031Service — Business logic for DepositV031 operations.
 */
@ApplicationScoped
public class DepositV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV031Service.class);

    @Inject
    private DepositV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV031> findById(Long id) {
        LOG.debug("Finding DepositV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV031 create(DepositV031 entity) {
        LOG.info("Creating DepositV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV031 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV031 update(Long id, DepositV031 entity) {
        LOG.info("Updating DepositV031 id: {}", id);
        DepositV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV031 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV031", id.toString());
    }
}
