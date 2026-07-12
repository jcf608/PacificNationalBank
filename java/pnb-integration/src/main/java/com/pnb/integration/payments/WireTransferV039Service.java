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
 * WireTransferV039Service — Business logic for WireTransferV039 operations.
 */
@ApplicationScoped
public class WireTransferV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV039Service.class);

    @Inject
    private WireTransferV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV039> findById(Long id) {
        LOG.debug("Finding WireTransferV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV039 create(WireTransferV039 entity) {
        LOG.info("Creating WireTransferV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV039 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV039 update(Long id, WireTransferV039 entity) {
        LOG.info("Updating WireTransferV039 id: {}", id);
        WireTransferV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV039 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV039", id.toString());
    }
}
