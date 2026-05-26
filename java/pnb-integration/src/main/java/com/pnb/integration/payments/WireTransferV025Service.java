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
 * WireTransferV025Service — Business logic for WireTransferV025 operations.
 */
@ApplicationScoped
public class WireTransferV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV025Service.class);

    @Inject
    private WireTransferV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV025> findById(Long id) {
        LOG.debug("Finding WireTransferV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV025 create(WireTransferV025 entity) {
        LOG.info("Creating WireTransferV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV025 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV025 update(Long id, WireTransferV025 entity) {
        LOG.info("Updating WireTransferV025 id: {}", id);
        WireTransferV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV025 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV025", id.toString());
    }
}
