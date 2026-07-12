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
 * DepositV019Service — Business logic for DepositV019 operations.
 */
@ApplicationScoped
public class DepositV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV019Service.class);

    @Inject
    private DepositV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV019> findById(Long id) {
        LOG.debug("Finding DepositV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV019 create(DepositV019 entity) {
        LOG.info("Creating DepositV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV019 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV019 update(Long id, DepositV019 entity) {
        LOG.info("Updating DepositV019 id: {}", id);
        DepositV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV019 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV019", id.toString());
    }
}
