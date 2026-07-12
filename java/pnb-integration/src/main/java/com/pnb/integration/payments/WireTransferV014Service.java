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
 * WireTransferV014Service — Business logic for WireTransferV014 operations.
 */
@ApplicationScoped
public class WireTransferV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV014Service.class);

    @Inject
    private WireTransferV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV014> findById(Long id) {
        LOG.debug("Finding WireTransferV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV014 create(WireTransferV014 entity) {
        LOG.info("Creating WireTransferV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV014 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV014 update(Long id, WireTransferV014 entity) {
        LOG.info("Updating WireTransferV014 id: {}", id);
        WireTransferV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV014 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV014", id.toString());
    }
}
