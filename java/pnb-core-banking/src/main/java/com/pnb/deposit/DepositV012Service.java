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
 * DepositV012Service — Business logic for DepositV012 operations.
 */
@ApplicationScoped
public class DepositV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV012Service.class);

    @Inject
    private DepositV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV012> findById(Long id) {
        LOG.debug("Finding DepositV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV012 create(DepositV012 entity) {
        LOG.info("Creating DepositV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV012 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV012 update(Long id, DepositV012 entity) {
        LOG.info("Updating DepositV012 id: {}", id);
        DepositV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV012 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV012", id.toString());
    }
}
