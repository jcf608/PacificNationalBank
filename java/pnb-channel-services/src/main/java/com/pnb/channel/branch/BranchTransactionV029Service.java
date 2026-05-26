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
 * BranchTransactionV029Service — Business logic for BranchTransactionV029 operations.
 */
@ApplicationScoped
public class BranchTransactionV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV029Service.class);

    @Inject
    private BranchTransactionV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV029> findById(Long id) {
        LOG.debug("Finding BranchTransactionV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV029 create(BranchTransactionV029 entity) {
        LOG.info("Creating BranchTransactionV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV029 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV029 update(Long id, BranchTransactionV029 entity) {
        LOG.info("Updating BranchTransactionV029 id: {}", id);
        BranchTransactionV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV029 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV029", id.toString());
    }
}
