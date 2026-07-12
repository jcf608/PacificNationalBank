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
 * BranchTransactionV033Service — Business logic for BranchTransactionV033 operations.
 */
@ApplicationScoped
public class BranchTransactionV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV033Service.class);

    @Inject
    private BranchTransactionV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV033> findById(Long id) {
        LOG.debug("Finding BranchTransactionV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV033 create(BranchTransactionV033 entity) {
        LOG.info("Creating BranchTransactionV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV033 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV033 update(Long id, BranchTransactionV033 entity) {
        LOG.info("Updating BranchTransactionV033 id: {}", id);
        BranchTransactionV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV033 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV033", id.toString());
    }
}
