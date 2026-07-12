package com.pnb.integration.payments;

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
 * WireTransferV004Service — Business logic for WireTransferV004 operations.
 */
@ApplicationScoped
public class WireTransferV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV004Service.class);

    @Inject
    private WireTransferV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV004> findById(Long id) {
        LOG.debug("Finding WireTransferV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV004 create(WireTransferV004 entity) {
        LOG.info("Creating WireTransferV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV004 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV004 update(Long id, WireTransferV004 entity) {
        LOG.info("Updating WireTransferV004 id: {}", id);
        WireTransferV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV004 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV004", id.toString());
    }
}
