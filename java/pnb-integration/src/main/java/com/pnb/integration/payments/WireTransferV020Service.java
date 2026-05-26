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
 * WireTransferV020Service — Business logic for WireTransferV020 operations.
 */
@ApplicationScoped
public class WireTransferV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV020Service.class);

    @Inject
    private WireTransferV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV020> findById(Long id) {
        LOG.debug("Finding WireTransferV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV020 create(WireTransferV020 entity) {
        LOG.info("Creating WireTransferV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV020 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV020 update(Long id, WireTransferV020 entity) {
        LOG.info("Updating WireTransferV020 id: {}", id);
        WireTransferV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV020 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV020", id.toString());
    }
}
