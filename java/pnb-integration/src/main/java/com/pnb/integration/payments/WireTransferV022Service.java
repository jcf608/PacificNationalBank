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
 * WireTransferV022Service — Business logic for WireTransferV022 operations.
 */
@ApplicationScoped
public class WireTransferV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV022Service.class);

    @Inject
    private WireTransferV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV022> findById(Long id) {
        LOG.debug("Finding WireTransferV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV022 create(WireTransferV022 entity) {
        LOG.info("Creating WireTransferV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV022 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV022 update(Long id, WireTransferV022 entity) {
        LOG.info("Updating WireTransferV022 id: {}", id);
        WireTransferV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV022 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV022", id.toString());
    }
}
