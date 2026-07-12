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
 * WireTransferV018Service — Business logic for WireTransferV018 operations.
 */
@ApplicationScoped
public class WireTransferV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV018Service.class);

    @Inject
    private WireTransferV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV018> findById(Long id) {
        LOG.debug("Finding WireTransferV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV018 create(WireTransferV018 entity) {
        LOG.info("Creating WireTransferV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV018 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV018 update(Long id, WireTransferV018 entity) {
        LOG.info("Updating WireTransferV018 id: {}", id);
        WireTransferV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV018 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV018", id.toString());
    }
}
