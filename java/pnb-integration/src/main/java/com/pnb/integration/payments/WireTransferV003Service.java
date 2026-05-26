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
 * WireTransferV003Service — Business logic for WireTransferV003 operations.
 */
@ApplicationScoped
public class WireTransferV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV003Service.class);

    @Inject
    private WireTransferV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV003> findById(Long id) {
        LOG.debug("Finding WireTransferV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV003 create(WireTransferV003 entity) {
        LOG.info("Creating WireTransferV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV003 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV003 update(Long id, WireTransferV003 entity) {
        LOG.info("Updating WireTransferV003 id: {}", id);
        WireTransferV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV003 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV003", id.toString());
    }
}
