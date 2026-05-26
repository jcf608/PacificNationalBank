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
 * BranchTransactionV023Service — Business logic for BranchTransactionV023 operations.
 */
@ApplicationScoped
public class BranchTransactionV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV023Service.class);

    @Inject
    private BranchTransactionV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV023> findById(Long id) {
        LOG.debug("Finding BranchTransactionV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV023 create(BranchTransactionV023 entity) {
        LOG.info("Creating BranchTransactionV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV023 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV023 update(Long id, BranchTransactionV023 entity) {
        LOG.info("Updating BranchTransactionV023 id: {}", id);
        BranchTransactionV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV023 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV023", id.toString());
    }
}
