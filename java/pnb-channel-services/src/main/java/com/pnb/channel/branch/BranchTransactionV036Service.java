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
 * BranchTransactionV036Service — Business logic for BranchTransactionV036 operations.
 */
@ApplicationScoped
public class BranchTransactionV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV036Service.class);

    @Inject
    private BranchTransactionV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV036> findById(Long id) {
        LOG.debug("Finding BranchTransactionV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV036 create(BranchTransactionV036 entity) {
        LOG.info("Creating BranchTransactionV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV036 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV036 update(Long id, BranchTransactionV036 entity) {
        LOG.info("Updating BranchTransactionV036 id: {}", id);
        BranchTransactionV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV036 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV036", id.toString());
    }
}
