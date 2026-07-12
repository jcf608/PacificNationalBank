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
 * BranchTransactionV006Service — Business logic for BranchTransactionV006 operations.
 */
@ApplicationScoped
public class BranchTransactionV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV006Service.class);

    @Inject
    private BranchTransactionV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV006> findById(Long id) {
        LOG.debug("Finding BranchTransactionV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV006 create(BranchTransactionV006 entity) {
        LOG.info("Creating BranchTransactionV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV006 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV006 update(Long id, BranchTransactionV006 entity) {
        LOG.info("Updating BranchTransactionV006 id: {}", id);
        BranchTransactionV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV006 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV006", id.toString());
    }
}
