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
 * WireTransferV023Service — Business logic for WireTransferV023 operations.
 */
@ApplicationScoped
public class WireTransferV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV023Service.class);

    @Inject
    private WireTransferV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV023> findById(Long id) {
        LOG.debug("Finding WireTransferV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV023 create(WireTransferV023 entity) {
        LOG.info("Creating WireTransferV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV023 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV023 update(Long id, WireTransferV023 entity) {
        LOG.info("Updating WireTransferV023 id: {}", id);
        WireTransferV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV023 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV023", id.toString());
    }
}
