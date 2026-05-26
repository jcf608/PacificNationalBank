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
 * BranchTransactionV014Service — Business logic for BranchTransactionV014 operations.
 */
@ApplicationScoped
public class BranchTransactionV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV014Service.class);

    @Inject
    private BranchTransactionV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV014> findById(Long id) {
        LOG.debug("Finding BranchTransactionV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV014 create(BranchTransactionV014 entity) {
        LOG.info("Creating BranchTransactionV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV014 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV014 update(Long id, BranchTransactionV014 entity) {
        LOG.info("Updating BranchTransactionV014 id: {}", id);
        BranchTransactionV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV014 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV014", id.toString());
    }
}
