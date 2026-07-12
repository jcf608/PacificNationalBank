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
 * WireTransferV000Service — Business logic for WireTransferV000 operations.
 */
@ApplicationScoped
public class WireTransferV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV000Service.class);

    @Inject
    private WireTransferV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV000> findById(Long id) {
        LOG.debug("Finding WireTransferV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV000 create(WireTransferV000 entity) {
        LOG.info("Creating WireTransferV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV000 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV000 update(Long id, WireTransferV000 entity) {
        LOG.info("Updating WireTransferV000 id: {}", id);
        WireTransferV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV000 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV000", id.toString());
    }
}
