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
 * BranchTransactionV009Service — Business logic for BranchTransactionV009 operations.
 */
@ApplicationScoped
public class BranchTransactionV009Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV009Service.class);

    @Inject
    private BranchTransactionV009Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV009> findById(Long id) {
        LOG.debug("Finding BranchTransactionV009 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV009> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV009 create(BranchTransactionV009 entity) {
        LOG.info("Creating BranchTransactionV009");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV009 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV009", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV009 update(Long id, BranchTransactionV009 entity) {
        LOG.info("Updating BranchTransactionV009 id: {}", id);
        BranchTransactionV009 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV009 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV009 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV009", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV009 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV009", id.toString());
    }
}
