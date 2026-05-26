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
 * BranchTransactionV000Service — Business logic for BranchTransactionV000 operations.
 */
@ApplicationScoped
public class BranchTransactionV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV000Service.class);

    @Inject
    private BranchTransactionV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV000> findById(Long id) {
        LOG.debug("Finding BranchTransactionV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV000 create(BranchTransactionV000 entity) {
        LOG.info("Creating BranchTransactionV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV000 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV000 update(Long id, BranchTransactionV000 entity) {
        LOG.info("Updating BranchTransactionV000 id: {}", id);
        BranchTransactionV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV000 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV000", id.toString());
    }
}
