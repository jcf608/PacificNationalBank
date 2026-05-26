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
 * BranchTransactionV007Service — Business logic for BranchTransactionV007 operations.
 */
@ApplicationScoped
public class BranchTransactionV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV007Service.class);

    @Inject
    private BranchTransactionV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV007> findById(Long id) {
        LOG.debug("Finding BranchTransactionV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV007 create(BranchTransactionV007 entity) {
        LOG.info("Creating BranchTransactionV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV007 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV007 update(Long id, BranchTransactionV007 entity) {
        LOG.info("Updating BranchTransactionV007 id: {}", id);
        BranchTransactionV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV007 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV007", id.toString());
    }
}
