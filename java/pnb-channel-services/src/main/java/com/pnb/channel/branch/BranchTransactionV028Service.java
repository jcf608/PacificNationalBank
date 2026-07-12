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
 * BranchTransactionV028Service — Business logic for BranchTransactionV028 operations.
 */
@ApplicationScoped
public class BranchTransactionV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV028Service.class);

    @Inject
    private BranchTransactionV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV028> findById(Long id) {
        LOG.debug("Finding BranchTransactionV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV028 create(BranchTransactionV028 entity) {
        LOG.info("Creating BranchTransactionV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV028 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV028 update(Long id, BranchTransactionV028 entity) {
        LOG.info("Updating BranchTransactionV028 id: {}", id);
        BranchTransactionV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV028 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV028", id.toString());
    }
}
