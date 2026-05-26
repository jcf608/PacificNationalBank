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
 * WireTransferV046Service — Business logic for WireTransferV046 operations.
 */
@ApplicationScoped
public class WireTransferV046Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV046Service.class);

    @Inject
    private WireTransferV046Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV046> findById(Long id) {
        LOG.debug("Finding WireTransferV046 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV046> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV046 create(WireTransferV046 entity) {
        LOG.info("Creating WireTransferV046");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV046 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV046", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV046 update(Long id, WireTransferV046 entity) {
        LOG.info("Updating WireTransferV046 id: {}", id);
        WireTransferV046 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV046 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV046 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV046", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV046 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV046", id.toString());
    }
}
