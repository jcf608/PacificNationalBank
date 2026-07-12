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
 * WireTransferV045Service — Business logic for WireTransferV045 operations.
 */
@ApplicationScoped
public class WireTransferV045Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV045Service.class);

    @Inject
    private WireTransferV045Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV045> findById(Long id) {
        LOG.debug("Finding WireTransferV045 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV045> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV045 create(WireTransferV045 entity) {
        LOG.info("Creating WireTransferV045");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV045 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV045", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV045 update(Long id, WireTransferV045 entity) {
        LOG.info("Updating WireTransferV045 id: {}", id);
        WireTransferV045 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV045 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV045 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV045", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV045 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV045", id.toString());
    }
}
