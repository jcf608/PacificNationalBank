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
 * WireTransferV049Service — Business logic for WireTransferV049 operations.
 */
@ApplicationScoped
public class WireTransferV049Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV049Service.class);

    @Inject
    private WireTransferV049Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV049> findById(Long id) {
        LOG.debug("Finding WireTransferV049 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV049> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV049 create(WireTransferV049 entity) {
        LOG.info("Creating WireTransferV049");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV049 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV049", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV049 update(Long id, WireTransferV049 entity) {
        LOG.info("Updating WireTransferV049 id: {}", id);
        WireTransferV049 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV049 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV049 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV049", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV049 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV049", id.toString());
    }
}
