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
 * BranchTransactionV013Service — Business logic for BranchTransactionV013 operations.
 */
@ApplicationScoped
public class BranchTransactionV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV013Service.class);

    @Inject
    private BranchTransactionV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV013> findById(Long id) {
        LOG.debug("Finding BranchTransactionV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV013 create(BranchTransactionV013 entity) {
        LOG.info("Creating BranchTransactionV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV013 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV013 update(Long id, BranchTransactionV013 entity) {
        LOG.info("Updating BranchTransactionV013 id: {}", id);
        BranchTransactionV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV013 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV013", id.toString());
    }
}
