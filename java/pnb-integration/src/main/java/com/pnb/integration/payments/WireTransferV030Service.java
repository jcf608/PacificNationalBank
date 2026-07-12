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
 * WireTransferV030Service — Business logic for WireTransferV030 operations.
 */
@ApplicationScoped
public class WireTransferV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV030Service.class);

    @Inject
    private WireTransferV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV030> findById(Long id) {
        LOG.debug("Finding WireTransferV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV030 create(WireTransferV030 entity) {
        LOG.info("Creating WireTransferV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV030 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV030 update(Long id, WireTransferV030 entity) {
        LOG.info("Updating WireTransferV030 id: {}", id);
        WireTransferV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV030 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV030", id.toString());
    }
}
