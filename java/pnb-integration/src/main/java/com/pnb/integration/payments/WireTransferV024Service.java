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
 * WireTransferV024Service — Business logic for WireTransferV024 operations.
 */
@ApplicationScoped
public class WireTransferV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV024Service.class);

    @Inject
    private WireTransferV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV024> findById(Long id) {
        LOG.debug("Finding WireTransferV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV024 create(WireTransferV024 entity) {
        LOG.info("Creating WireTransferV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV024 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV024 update(Long id, WireTransferV024 entity) {
        LOG.info("Updating WireTransferV024 id: {}", id);
        WireTransferV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV024 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV024", id.toString());
    }
}
