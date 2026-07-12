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
 * BranchTransactionV035Service — Business logic for BranchTransactionV035 operations.
 */
@ApplicationScoped
public class BranchTransactionV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV035Service.class);

    @Inject
    private BranchTransactionV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV035> findById(Long id) {
        LOG.debug("Finding BranchTransactionV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV035 create(BranchTransactionV035 entity) {
        LOG.info("Creating BranchTransactionV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV035 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV035 update(Long id, BranchTransactionV035 entity) {
        LOG.info("Updating BranchTransactionV035 id: {}", id);
        BranchTransactionV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV035 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV035", id.toString());
    }
}
