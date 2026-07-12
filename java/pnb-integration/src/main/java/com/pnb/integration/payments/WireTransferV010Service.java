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
 * WireTransferV010Service — Business logic for WireTransferV010 operations.
 */
@ApplicationScoped
public class WireTransferV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV010Service.class);

    @Inject
    private WireTransferV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV010> findById(Long id) {
        LOG.debug("Finding WireTransferV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV010 create(WireTransferV010 entity) {
        LOG.info("Creating WireTransferV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV010 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV010 update(Long id, WireTransferV010 entity) {
        LOG.info("Updating WireTransferV010 id: {}", id);
        WireTransferV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV010 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV010", id.toString());
    }
}
