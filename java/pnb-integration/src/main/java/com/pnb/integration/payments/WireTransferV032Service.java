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
 * WireTransferV032Service — Business logic for WireTransferV032 operations.
 */
@ApplicationScoped
public class WireTransferV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV032Service.class);

    @Inject
    private WireTransferV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV032> findById(Long id) {
        LOG.debug("Finding WireTransferV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV032 create(WireTransferV032 entity) {
        LOG.info("Creating WireTransferV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV032 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV032 update(Long id, WireTransferV032 entity) {
        LOG.info("Updating WireTransferV032 id: {}", id);
        WireTransferV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV032 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV032", id.toString());
    }
}
