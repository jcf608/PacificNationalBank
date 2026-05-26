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
 * DepositV005Service — Business logic for DepositV005 operations.
 */
@ApplicationScoped
public class DepositV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV005Service.class);

    @Inject
    private DepositV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV005> findById(Long id) {
        LOG.debug("Finding DepositV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV005 create(DepositV005 entity) {
        LOG.info("Creating DepositV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV005 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV005 update(Long id, DepositV005 entity) {
        LOG.info("Updating DepositV005 id: {}", id);
        DepositV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV005 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV005", id.toString());
    }
}
