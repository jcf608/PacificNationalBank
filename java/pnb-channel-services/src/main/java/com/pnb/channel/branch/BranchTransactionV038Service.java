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
 * BranchTransactionV038Service — Business logic for BranchTransactionV038 operations.
 */
@ApplicationScoped
public class BranchTransactionV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV038Service.class);

    @Inject
    private BranchTransactionV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV038> findById(Long id) {
        LOG.debug("Finding BranchTransactionV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV038 create(BranchTransactionV038 entity) {
        LOG.info("Creating BranchTransactionV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV038 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV038 update(Long id, BranchTransactionV038 entity) {
        LOG.info("Updating BranchTransactionV038 id: {}", id);
        BranchTransactionV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV038 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV038", id.toString());
    }
}
