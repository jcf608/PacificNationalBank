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
 * BranchTransactionV020Service — Business logic for BranchTransactionV020 operations.
 */
@ApplicationScoped
public class BranchTransactionV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV020Service.class);

    @Inject
    private BranchTransactionV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV020> findById(Long id) {
        LOG.debug("Finding BranchTransactionV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV020 create(BranchTransactionV020 entity) {
        LOG.info("Creating BranchTransactionV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV020 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV020 update(Long id, BranchTransactionV020 entity) {
        LOG.info("Updating BranchTransactionV020 id: {}", id);
        BranchTransactionV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV020 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV020", id.toString());
    }
}
