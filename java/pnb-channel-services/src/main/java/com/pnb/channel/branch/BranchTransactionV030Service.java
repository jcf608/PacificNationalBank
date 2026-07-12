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
 * BranchTransactionV030Service — Business logic for BranchTransactionV030 operations.
 */
@ApplicationScoped
public class BranchTransactionV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV030Service.class);

    @Inject
    private BranchTransactionV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV030> findById(Long id) {
        LOG.debug("Finding BranchTransactionV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV030 create(BranchTransactionV030 entity) {
        LOG.info("Creating BranchTransactionV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV030 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV030 update(Long id, BranchTransactionV030 entity) {
        LOG.info("Updating BranchTransactionV030 id: {}", id);
        BranchTransactionV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV030 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV030", id.toString());
    }
}
