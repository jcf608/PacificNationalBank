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
 * BranchTransactionV008Service — Business logic for BranchTransactionV008 operations.
 */
@ApplicationScoped
public class BranchTransactionV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV008Service.class);

    @Inject
    private BranchTransactionV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV008> findById(Long id) {
        LOG.debug("Finding BranchTransactionV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV008 create(BranchTransactionV008 entity) {
        LOG.info("Creating BranchTransactionV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV008 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV008 update(Long id, BranchTransactionV008 entity) {
        LOG.info("Updating BranchTransactionV008 id: {}", id);
        BranchTransactionV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV008 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV008", id.toString());
    }
}
