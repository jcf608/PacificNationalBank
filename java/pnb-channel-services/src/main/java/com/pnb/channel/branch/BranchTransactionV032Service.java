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
 * BranchTransactionV032Service — Business logic for BranchTransactionV032 operations.
 */
@ApplicationScoped
public class BranchTransactionV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV032Service.class);

    @Inject
    private BranchTransactionV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV032> findById(Long id) {
        LOG.debug("Finding BranchTransactionV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV032 create(BranchTransactionV032 entity) {
        LOG.info("Creating BranchTransactionV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV032 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV032 update(Long id, BranchTransactionV032 entity) {
        LOG.info("Updating BranchTransactionV032 id: {}", id);
        BranchTransactionV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV032 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV032", id.toString());
    }
}
