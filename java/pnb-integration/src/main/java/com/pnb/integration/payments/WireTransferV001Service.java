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
 * WireTransferV001Service — Business logic for WireTransferV001 operations.
 */
@ApplicationScoped
public class WireTransferV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV001Service.class);

    @Inject
    private WireTransferV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV001> findById(Long id) {
        LOG.debug("Finding WireTransferV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV001 create(WireTransferV001 entity) {
        LOG.info("Creating WireTransferV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV001 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV001 update(Long id, WireTransferV001 entity) {
        LOG.info("Updating WireTransferV001 id: {}", id);
        WireTransferV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV001 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV001", id.toString());
    }
}
