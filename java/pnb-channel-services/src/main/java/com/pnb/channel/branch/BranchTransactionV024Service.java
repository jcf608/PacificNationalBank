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
 * BranchTransactionV024Service — Business logic for BranchTransactionV024 operations.
 */
@ApplicationScoped
public class BranchTransactionV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV024Service.class);

    @Inject
    private BranchTransactionV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV024> findById(Long id) {
        LOG.debug("Finding BranchTransactionV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV024 create(BranchTransactionV024 entity) {
        LOG.info("Creating BranchTransactionV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV024 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV024 update(Long id, BranchTransactionV024 entity) {
        LOG.info("Updating BranchTransactionV024 id: {}", id);
        BranchTransactionV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV024 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV024", id.toString());
    }
}
