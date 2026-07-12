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
 * WireTransferV034Service — Business logic for WireTransferV034 operations.
 */
@ApplicationScoped
public class WireTransferV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV034Service.class);

    @Inject
    private WireTransferV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV034> findById(Long id) {
        LOG.debug("Finding WireTransferV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV034 create(WireTransferV034 entity) {
        LOG.info("Creating WireTransferV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV034 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV034 update(Long id, WireTransferV034 entity) {
        LOG.info("Updating WireTransferV034 id: {}", id);
        WireTransferV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV034 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV034", id.toString());
    }
}
