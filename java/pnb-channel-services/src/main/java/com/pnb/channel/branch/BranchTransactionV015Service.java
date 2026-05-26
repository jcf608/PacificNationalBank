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
 * BranchTransactionV015Service — Business logic for BranchTransactionV015 operations.
 */
@ApplicationScoped
public class BranchTransactionV015Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV015Service.class);

    @Inject
    private BranchTransactionV015Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV015> findById(Long id) {
        LOG.debug("Finding BranchTransactionV015 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV015> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV015 create(BranchTransactionV015 entity) {
        LOG.info("Creating BranchTransactionV015");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV015 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV015", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV015 update(Long id, BranchTransactionV015 entity) {
        LOG.info("Updating BranchTransactionV015 id: {}", id);
        BranchTransactionV015 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV015 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV015 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV015", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV015 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV015", id.toString());
    }
}
