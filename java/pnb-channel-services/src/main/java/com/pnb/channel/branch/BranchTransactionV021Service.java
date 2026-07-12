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
 * BranchTransactionV021Service — Business logic for BranchTransactionV021 operations.
 */
@ApplicationScoped
public class BranchTransactionV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV021Service.class);

    @Inject
    private BranchTransactionV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV021> findById(Long id) {
        LOG.debug("Finding BranchTransactionV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV021 create(BranchTransactionV021 entity) {
        LOG.info("Creating BranchTransactionV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV021 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV021 update(Long id, BranchTransactionV021 entity) {
        LOG.info("Updating BranchTransactionV021 id: {}", id);
        BranchTransactionV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV021 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV021", id.toString());
    }
}
