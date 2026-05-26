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
 * BranchTransactionV022Service — Business logic for BranchTransactionV022 operations.
 */
@ApplicationScoped
public class BranchTransactionV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV022Service.class);

    @Inject
    private BranchTransactionV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV022> findById(Long id) {
        LOG.debug("Finding BranchTransactionV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV022 create(BranchTransactionV022 entity) {
        LOG.info("Creating BranchTransactionV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV022 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV022 update(Long id, BranchTransactionV022 entity) {
        LOG.info("Updating BranchTransactionV022 id: {}", id);
        BranchTransactionV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV022 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV022", id.toString());
    }
}
