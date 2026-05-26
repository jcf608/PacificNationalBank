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
 * WireTransferV029Service — Business logic for WireTransferV029 operations.
 */
@ApplicationScoped
public class WireTransferV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV029Service.class);

    @Inject
    private WireTransferV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV029> findById(Long id) {
        LOG.debug("Finding WireTransferV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV029 create(WireTransferV029 entity) {
        LOG.info("Creating WireTransferV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV029 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV029 update(Long id, WireTransferV029 entity) {
        LOG.info("Updating WireTransferV029 id: {}", id);
        WireTransferV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV029 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV029", id.toString());
    }
}
