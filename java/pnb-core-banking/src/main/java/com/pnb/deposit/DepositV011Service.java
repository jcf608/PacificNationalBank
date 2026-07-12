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
 * DepositV011Service — Business logic for DepositV011 operations.
 */
@ApplicationScoped
public class DepositV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(DepositV011Service.class);

    @Inject
    private DepositV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<DepositV011> findById(Long id) {
        LOG.debug("Finding DepositV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<DepositV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public DepositV011 create(DepositV011 entity) {
        LOG.info("Creating DepositV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV011 saved = repository.save(entity);
        auditService.log("CREATE", "DepositV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public DepositV011 update(Long id, DepositV011 entity) {
        LOG.info("Updating DepositV011 id: {}", id);
        DepositV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("DepositV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        DepositV011 updated = repository.save(entity);
        auditService.log("UPDATE", "DepositV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting DepositV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "DepositV011", id.toString());
    }
}
