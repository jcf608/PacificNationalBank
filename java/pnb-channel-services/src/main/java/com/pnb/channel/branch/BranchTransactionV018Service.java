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
 * BranchTransactionV018Service — Business logic for BranchTransactionV018 operations.
 */
@ApplicationScoped
public class BranchTransactionV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV018Service.class);

    @Inject
    private BranchTransactionV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV018> findById(Long id) {
        LOG.debug("Finding BranchTransactionV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV018 create(BranchTransactionV018 entity) {
        LOG.info("Creating BranchTransactionV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV018 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV018 update(Long id, BranchTransactionV018 entity) {
        LOG.info("Updating BranchTransactionV018 id: {}", id);
        BranchTransactionV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV018 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV018", id.toString());
    }
}
