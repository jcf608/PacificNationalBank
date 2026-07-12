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
 * BranchTransactionV034Service — Business logic for BranchTransactionV034 operations.
 */
@ApplicationScoped
public class BranchTransactionV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV034Service.class);

    @Inject
    private BranchTransactionV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV034> findById(Long id) {
        LOG.debug("Finding BranchTransactionV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV034 create(BranchTransactionV034 entity) {
        LOG.info("Creating BranchTransactionV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV034 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV034 update(Long id, BranchTransactionV034 entity) {
        LOG.info("Updating BranchTransactionV034 id: {}", id);
        BranchTransactionV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV034 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV034", id.toString());
    }
}
