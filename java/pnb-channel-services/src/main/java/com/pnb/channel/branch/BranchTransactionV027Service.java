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
 * BranchTransactionV027Service — Business logic for BranchTransactionV027 operations.
 */
@ApplicationScoped
public class BranchTransactionV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV027Service.class);

    @Inject
    private BranchTransactionV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV027> findById(Long id) {
        LOG.debug("Finding BranchTransactionV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV027 create(BranchTransactionV027 entity) {
        LOG.info("Creating BranchTransactionV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV027 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV027 update(Long id, BranchTransactionV027 entity) {
        LOG.info("Updating BranchTransactionV027 id: {}", id);
        BranchTransactionV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV027 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV027", id.toString());
    }
}
