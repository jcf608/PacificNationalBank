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
 * WireTransferV038Service — Business logic for WireTransferV038 operations.
 */
@ApplicationScoped
public class WireTransferV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV038Service.class);

    @Inject
    private WireTransferV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV038> findById(Long id) {
        LOG.debug("Finding WireTransferV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV038 create(WireTransferV038 entity) {
        LOG.info("Creating WireTransferV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV038 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV038 update(Long id, WireTransferV038 entity) {
        LOG.info("Updating WireTransferV038 id: {}", id);
        WireTransferV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV038 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV038", id.toString());
    }
}
