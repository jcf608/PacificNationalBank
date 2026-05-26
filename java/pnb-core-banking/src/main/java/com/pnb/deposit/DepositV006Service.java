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
 * DepositV006Service — Business logic for DepositV006 operations.
 */
@ApplicationScoped
public class DepositV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV006Service.class);

    @Inject
    private DepositV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV006> findById(Long id) {
        LOG.debug("Finding DepositV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV006 create(DepositV006 entity) {
        LOG.info("Creating DepositV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV006 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV006 update(Long id, DepositV006 entity) {
        LOG.info("Updating DepositV006 id: {}", id);
        DepositV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV006 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV006", id.toString());
    }
}
