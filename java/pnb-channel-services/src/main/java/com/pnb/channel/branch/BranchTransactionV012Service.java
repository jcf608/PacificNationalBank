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
 * BranchTransactionV012Service — Business logic for BranchTransactionV012 operations.
 */
@ApplicationScoped
public class BranchTransactionV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV012Service.class);

    @Inject
    private BranchTransactionV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV012> findById(Long id) {
        LOG.debug("Finding BranchTransactionV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV012 create(BranchTransactionV012 entity) {
        LOG.info("Creating BranchTransactionV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV012 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV012 update(Long id, BranchTransactionV012 entity) {
        LOG.info("Updating BranchTransactionV012 id: {}", id);
        BranchTransactionV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV012 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV012", id.toString());
    }
}
