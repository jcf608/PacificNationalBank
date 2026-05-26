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
 * WireTransferV026Service — Business logic for WireTransferV026 operations.
 */
@ApplicationScoped
public class WireTransferV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV026Service.class);

    @Inject
    private WireTransferV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV026> findById(Long id) {
        LOG.debug("Finding WireTransferV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV026 create(WireTransferV026 entity) {
        LOG.info("Creating WireTransferV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV026 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV026 update(Long id, WireTransferV026 entity) {
        LOG.info("Updating WireTransferV026 id: {}", id);
        WireTransferV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV026 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV026", id.toString());
    }
}
