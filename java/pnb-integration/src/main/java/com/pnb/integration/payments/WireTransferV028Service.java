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
 * WireTransferV028Service — Business logic for WireTransferV028 operations.
 */
@ApplicationScoped
public class WireTransferV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV028Service.class);

    @Inject
    private WireTransferV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV028> findById(Long id) {
        LOG.debug("Finding WireTransferV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV028 create(WireTransferV028 entity) {
        LOG.info("Creating WireTransferV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV028 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV028 update(Long id, WireTransferV028 entity) {
        LOG.info("Updating WireTransferV028 id: {}", id);
        WireTransferV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV028 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV028", id.toString());
    }
}
