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
 * WireTransferV033Service — Business logic for WireTransferV033 operations.
 */
@ApplicationScoped
public class WireTransferV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV033Service.class);

    @Inject
    private WireTransferV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV033> findById(Long id) {
        LOG.debug("Finding WireTransferV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV033 create(WireTransferV033 entity) {
        LOG.info("Creating WireTransferV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV033 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV033 update(Long id, WireTransferV033 entity) {
        LOG.info("Updating WireTransferV033 id: {}", id);
        WireTransferV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV033 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV033", id.toString());
    }
}
