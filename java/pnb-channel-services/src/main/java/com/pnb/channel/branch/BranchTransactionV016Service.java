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
 * BranchTransactionV016Service — Business logic for BranchTransactionV016 operations.
 */
@ApplicationScoped
public class BranchTransactionV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV016Service.class);

    @Inject
    private BranchTransactionV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV016> findById(Long id) {
        LOG.debug("Finding BranchTransactionV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV016 create(BranchTransactionV016 entity) {
        LOG.info("Creating BranchTransactionV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV016 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV016 update(Long id, BranchTransactionV016 entity) {
        LOG.info("Updating BranchTransactionV016 id: {}", id);
        BranchTransactionV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV016 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV016", id.toString());
    }
}
