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
 * WireTransferV037Service — Business logic for WireTransferV037 operations.
 */
@ApplicationScoped
public class WireTransferV037Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV037Service.class);

    @Inject
    private WireTransferV037Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV037> findById(Long id) {
        LOG.debug("Finding WireTransferV037 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV037> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV037 create(WireTransferV037 entity) {
        LOG.info("Creating WireTransferV037");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV037 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV037", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV037 update(Long id, WireTransferV037 entity) {
        LOG.info("Updating WireTransferV037 id: {}", id);
        WireTransferV037 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV037 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV037 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV037", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV037 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV037", id.toString());
    }
}
