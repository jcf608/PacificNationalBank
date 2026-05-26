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
 * WireTransferV015Service — Business logic for WireTransferV015 operations.
 */
@ApplicationScoped
public class WireTransferV015Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV015Service.class);

    @Inject
    private WireTransferV015Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV015> findById(Long id) {
        LOG.debug("Finding WireTransferV015 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV015> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV015 create(WireTransferV015 entity) {
        LOG.info("Creating WireTransferV015");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV015 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV015", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV015 update(Long id, WireTransferV015 entity) {
        LOG.info("Updating WireTransferV015 id: {}", id);
        WireTransferV015 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV015 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV015 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV015", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV015 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV015", id.toString());
    }
}
