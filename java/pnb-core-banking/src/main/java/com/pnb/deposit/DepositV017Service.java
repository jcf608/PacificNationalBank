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
 * DepositV017Service — Business logic for DepositV017 operations.
 */
@ApplicationScoped
public class DepositV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV017Service.class);

    @Inject
    private DepositV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV017> findById(Long id) {
        LOG.debug("Finding DepositV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV017 create(DepositV017 entity) {
        LOG.info("Creating DepositV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV017 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV017 update(Long id, DepositV017 entity) {
        LOG.info("Updating DepositV017 id: {}", id);
        DepositV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV017 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV017", id.toString());
    }
}
