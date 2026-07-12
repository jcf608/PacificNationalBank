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
 * BranchTransactionV019Service — Business logic for BranchTransactionV019 operations.
 */
@ApplicationScoped
public class BranchTransactionV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(BranchTransactionV019Service.class);

    @Inject
    private BranchTransactionV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<BranchTransactionV019> findById(Long id) {
        LOG.debug("Finding BranchTransactionV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<BranchTransactionV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public BranchTransactionV019 create(BranchTransactionV019 entity) {
        LOG.info("Creating BranchTransactionV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV019 saved = repository.save(entity);
        auditService.log("CREATE", "BranchTransactionV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public BranchTransactionV019 update(Long id, BranchTransactionV019 entity) {
        LOG.info("Updating BranchTransactionV019 id: {}", id);
        BranchTransactionV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("BranchTransactionV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        BranchTransactionV019 updated = repository.save(entity);
        auditService.log("UPDATE", "BranchTransactionV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting BranchTransactionV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "BranchTransactionV019", id.toString());
    }
}
