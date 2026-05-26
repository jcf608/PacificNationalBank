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
 * BranchTransactionV003Service — Business logic for BranchTransactionV003 operations.
 */
@ApplicationScoped
public class BranchTransactionV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV003Service.class);

    @Inject
    private BranchTransactionV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV003> findById(Long id) {
        LOG.debug("Finding BranchTransactionV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV003 create(BranchTransactionV003 entity) {
        LOG.info("Creating BranchTransactionV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV003 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV003 update(Long id, BranchTransactionV003 entity) {
        LOG.info("Updating BranchTransactionV003 id: {}", id);
        BranchTransactionV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV003 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV003", id.toString());
    }
}
