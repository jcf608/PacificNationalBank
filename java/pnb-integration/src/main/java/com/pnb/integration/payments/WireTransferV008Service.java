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
 * WireTransferV008Service — Business logic for WireTransferV008 operations.
 */
@ApplicationScoped
public class WireTransferV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV008Service.class);

    @Inject
    private WireTransferV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV008> findById(Long id) {
        LOG.debug("Finding WireTransferV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV008 create(WireTransferV008 entity) {
        LOG.info("Creating WireTransferV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV008 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV008 update(Long id, WireTransferV008 entity) {
        LOG.info("Updating WireTransferV008 id: {}", id);
        WireTransferV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV008 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV008", id.toString());
    }
}
