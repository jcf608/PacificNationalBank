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
 * BranchTransactionV002Service — Business logic for BranchTransactionV002 operations.
 */
@ApplicationScoped
public class BranchTransactionV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV002Service.class);

    @Inject
    private BranchTransactionV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV002> findById(Long id) {
        LOG.debug("Finding BranchTransactionV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV002 create(BranchTransactionV002 entity) {
        LOG.info("Creating BranchTransactionV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV002 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV002 update(Long id, BranchTransactionV002 entity) {
        LOG.info("Updating BranchTransactionV002 id: {}", id);
        BranchTransactionV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV002 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV002", id.toString());
    }
}
