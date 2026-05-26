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
 * BranchTransactionV017Service — Business logic for BranchTransactionV017 operations.
 */
@ApplicationScoped
public class BranchTransactionV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV017Service.class);

    @Inject
    private BranchTransactionV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV017> findById(Long id) {
        LOG.debug("Finding BranchTransactionV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV017 create(BranchTransactionV017 entity) {
        LOG.info("Creating BranchTransactionV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV017 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV017 update(Long id, BranchTransactionV017 entity) {
        LOG.info("Updating BranchTransactionV017 id: {}", id);
        BranchTransactionV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV017 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV017", id.toString());
    }
}
