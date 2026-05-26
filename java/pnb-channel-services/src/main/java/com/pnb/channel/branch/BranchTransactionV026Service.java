package com.pnb.channel.branch;

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
 * BranchTransactionV026Service — Business logic for BranchTransactionV026 operations.
 */
@ApplicationScoped
public class BranchTransactionV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV026Service.class);

    @Inject
    private BranchTransactionV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV026> findById(Long id) {
        LOG.debug("Finding BranchTransactionV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV026 create(BranchTransactionV026 entity) {
        LOG.info("Creating BranchTransactionV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV026 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV026 update(Long id, BranchTransactionV026 entity) {
        LOG.info("Updating BranchTransactionV026 id: {}", id);
        BranchTransactionV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV026 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV026", id.toString());
    }
}
