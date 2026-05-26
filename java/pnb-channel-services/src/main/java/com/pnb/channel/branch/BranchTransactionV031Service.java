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
 * BranchTransactionV031Service — Business logic for BranchTransactionV031 operations.
 */
@ApplicationScoped
public class BranchTransactionV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV031Service.class);

    @Inject
    private BranchTransactionV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV031> findById(Long id) {
        LOG.debug("Finding BranchTransactionV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV031 create(BranchTransactionV031 entity) {
        LOG.info("Creating BranchTransactionV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV031 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV031 update(Long id, BranchTransactionV031 entity) {
        LOG.info("Updating BranchTransactionV031 id: {}", id);
        BranchTransactionV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV031 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV031", id.toString());
    }
}
