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
 * WireTransferV007Service — Business logic for WireTransferV007 operations.
 */
@ApplicationScoped
public class WireTransferV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV007Service.class);

    @Inject
    private WireTransferV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV007> findById(Long id) {
        LOG.debug("Finding WireTransferV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV007 create(WireTransferV007 entity) {
        LOG.info("Creating WireTransferV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV007 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV007 update(Long id, WireTransferV007 entity) {
        LOG.info("Updating WireTransferV007 id: {}", id);
        WireTransferV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV007 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV007", id.toString());
    }
}
