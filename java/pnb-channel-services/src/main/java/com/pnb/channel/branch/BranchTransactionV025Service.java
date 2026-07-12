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
 * BranchTransactionV025Service — Business logic for BranchTransactionV025 operations.
 */
@ApplicationScoped
public class BranchTransactionV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV025Service.class);

    @Inject
    private BranchTransactionV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV025> findById(Long id) {
        LOG.debug("Finding BranchTransactionV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV025 create(BranchTransactionV025 entity) {
        LOG.info("Creating BranchTransactionV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV025 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV025 update(Long id, BranchTransactionV025 entity) {
        LOG.info("Updating BranchTransactionV025 id: {}", id);
        BranchTransactionV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV025 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV025", id.toString());
    }
}
