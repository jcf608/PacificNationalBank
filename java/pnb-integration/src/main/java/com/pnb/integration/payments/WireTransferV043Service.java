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
 * WireTransferV043Service — Business logic for WireTransferV043 operations.
 */
@ApplicationScoped
public class WireTransferV043Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV043Service.class);

    @Inject
    private WireTransferV043Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV043> findById(Long id) {
        LOG.debug("Finding WireTransferV043 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV043> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV043 create(WireTransferV043 entity) {
        LOG.info("Creating WireTransferV043");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV043 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV043", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV043 update(Long id, WireTransferV043 entity) {
        LOG.info("Updating WireTransferV043 id: {}", id);
        WireTransferV043 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV043 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV043 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV043", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV043 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV043", id.toString());
    }
}
