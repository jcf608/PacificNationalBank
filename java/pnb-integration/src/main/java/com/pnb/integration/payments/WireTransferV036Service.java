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
 * WireTransferV036Service — Business logic for WireTransferV036 operations.
 */
@ApplicationScoped
public class WireTransferV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV036Service.class);

    @Inject
    private WireTransferV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV036> findById(Long id) {
        LOG.debug("Finding WireTransferV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV036 create(WireTransferV036 entity) {
        LOG.info("Creating WireTransferV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV036 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV036 update(Long id, WireTransferV036 entity) {
        LOG.info("Updating WireTransferV036 id: {}", id);
        WireTransferV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV036 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV036", id.toString());
    }
}
