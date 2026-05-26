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
 * BranchTransactionV039Service — Business logic for BranchTransactionV039 operations.
 */
@ApplicationScoped
public class BranchTransactionV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV039Service.class);

    @Inject
    private BranchTransactionV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV039> findById(Long id) {
        LOG.debug("Finding BranchTransactionV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV039 create(BranchTransactionV039 entity) {
        LOG.info("Creating BranchTransactionV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV039 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV039 update(Long id, BranchTransactionV039 entity) {
        LOG.info("Updating BranchTransactionV039 id: {}", id);
        BranchTransactionV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV039 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV039", id.toString());
    }
}
