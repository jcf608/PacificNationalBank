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
 * WireTransferV005Service — Business logic for WireTransferV005 operations.
 */
@ApplicationScoped
public class WireTransferV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV005Service.class);

    @Inject
    private WireTransferV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV005> findById(Long id) {
        LOG.debug("Finding WireTransferV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV005 create(WireTransferV005 entity) {
        LOG.info("Creating WireTransferV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV005 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV005 update(Long id, WireTransferV005 entity) {
        LOG.info("Updating WireTransferV005 id: {}", id);
        WireTransferV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV005 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV005", id.toString());
    }
}
