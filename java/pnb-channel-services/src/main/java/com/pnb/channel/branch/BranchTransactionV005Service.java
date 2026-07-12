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
 * BranchTransactionV005Service — Business logic for BranchTransactionV005 operations.
 */
@ApplicationScoped
public class BranchTransactionV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV005Service.class);

    @Inject
    private BranchTransactionV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV005> findById(Long id) {
        LOG.debug("Finding BranchTransactionV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV005 create(BranchTransactionV005 entity) {
        LOG.info("Creating BranchTransactionV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV005 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV005 update(Long id, BranchTransactionV005 entity) {
        LOG.info("Updating BranchTransactionV005 id: {}", id);
        BranchTransactionV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV005 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV005", id.toString());
    }
}
