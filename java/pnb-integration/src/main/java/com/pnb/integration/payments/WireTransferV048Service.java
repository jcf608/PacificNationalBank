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
 * WireTransferV048Service — Business logic for WireTransferV048 operations.
 */
@ApplicationScoped
public class WireTransferV048Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV048Service.class);

    @Inject
    private WireTransferV048Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV048> findById(Long id) {
        LOG.debug("Finding WireTransferV048 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV048> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV048 create(WireTransferV048 entity) {
        LOG.info("Creating WireTransferV048");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV048 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV048", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV048 update(Long id, WireTransferV048 entity) {
        LOG.info("Updating WireTransferV048 id: {}", id);
        WireTransferV048 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV048 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV048 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV048", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV048 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV048", id.toString());
    }
}
