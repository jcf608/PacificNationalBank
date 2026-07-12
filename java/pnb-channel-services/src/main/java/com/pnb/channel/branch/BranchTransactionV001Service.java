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
 * BranchTransactionV001Service — Business logic for BranchTransactionV001 operations.
 */
@ApplicationScoped
public class BranchTransactionV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV001Service.class);

    @Inject
    private BranchTransactionV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV001> findById(Long id) {
        LOG.debug("Finding BranchTransactionV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV001 create(BranchTransactionV001 entity) {
        LOG.info("Creating BranchTransactionV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV001 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV001 update(Long id, BranchTransactionV001 entity) {
        LOG.info("Updating BranchTransactionV001 id: {}", id);
        BranchTransactionV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV001 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV001", id.toString());
    }
}
