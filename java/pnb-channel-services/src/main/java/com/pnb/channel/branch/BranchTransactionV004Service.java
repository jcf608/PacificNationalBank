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
 * BranchTransactionV004Service — Business logic for BranchTransactionV004 operations.
 */
@ApplicationScoped
public class BranchTransactionV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV004Service.class);

    @Inject
    private BranchTransactionV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV004> findById(Long id) {
        LOG.debug("Finding BranchTransactionV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV004 create(BranchTransactionV004 entity) {
        LOG.info("Creating BranchTransactionV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV004 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV004 update(Long id, BranchTransactionV004 entity) {
        LOG.info("Updating BranchTransactionV004 id: {}", id);
        BranchTransactionV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV004 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV004", id.toString());
    }
}
