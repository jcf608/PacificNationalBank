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
 * WireTransferV002Service — Business logic for WireTransferV002 operations.
 */
@ApplicationScoped
public class WireTransferV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV002Service.class);

    @Inject
    private WireTransferV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV002> findById(Long id) {
        LOG.debug("Finding WireTransferV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV002 create(WireTransferV002 entity) {
        LOG.info("Creating WireTransferV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV002 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV002 update(Long id, WireTransferV002 entity) {
        LOG.info("Updating WireTransferV002 id: {}", id);
        WireTransferV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV002 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV002", id.toString());
    }
}
