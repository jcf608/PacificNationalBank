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
 * WireTransferV012Service — Business logic for WireTransferV012 operations.
 */
@ApplicationScoped
public class WireTransferV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV012Service.class);

    @Inject
    private WireTransferV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV012> findById(Long id) {
        LOG.debug("Finding WireTransferV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV012 create(WireTransferV012 entity) {
        LOG.info("Creating WireTransferV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV012 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV012 update(Long id, WireTransferV012 entity) {
        LOG.info("Updating WireTransferV012 id: {}", id);
        WireTransferV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV012 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV012", id.toString());
    }
}
