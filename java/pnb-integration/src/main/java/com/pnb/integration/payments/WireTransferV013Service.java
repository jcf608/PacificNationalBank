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
 * WireTransferV013Service — Business logic for WireTransferV013 operations.
 */
@ApplicationScoped
public class WireTransferV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV013Service.class);

    @Inject
    private WireTransferV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV013> findById(Long id) {
        LOG.debug("Finding WireTransferV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV013 create(WireTransferV013 entity) {
        LOG.info("Creating WireTransferV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV013 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV013 update(Long id, WireTransferV013 entity) {
        LOG.info("Updating WireTransferV013 id: {}", id);
        WireTransferV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV013 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV013", id.toString());
    }
}
