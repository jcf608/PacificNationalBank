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
 * BranchTransactionV011Service — Business logic for BranchTransactionV011 operations.
 */
@ApplicationScoped
public class BranchTransactionV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV011Service.class);

    @Inject
    private BranchTransactionV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV011> findById(Long id) {
        LOG.debug("Finding BranchTransactionV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV011 create(BranchTransactionV011 entity) {
        LOG.info("Creating BranchTransactionV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV011 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV011 update(Long id, BranchTransactionV011 entity) {
        LOG.info("Updating BranchTransactionV011 id: {}", id);
        BranchTransactionV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV011 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV011", id.toString());
    }
}
