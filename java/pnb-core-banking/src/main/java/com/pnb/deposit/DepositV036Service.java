package com.pnb.deposit;

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
 * DepositV036Service — Business logic for DepositV036 operations.
 */
@ApplicationScoped
public class DepositV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV036Service.class);

    @Inject
    private DepositV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV036> findById(Long id) {
        LOG.debug("Finding DepositV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV036 create(DepositV036 entity) {
        LOG.info("Creating DepositV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV036 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV036 update(Long id, DepositV036 entity) {
        LOG.info("Updating DepositV036 id: {}", id);
        DepositV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV036 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV036", id.toString());
    }
}
