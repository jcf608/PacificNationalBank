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
 * WireTransferV006Service — Business logic for WireTransferV006 operations.
 */
@ApplicationScoped
public class WireTransferV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV006Service.class);

    @Inject
    private WireTransferV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV006> findById(Long id) {
        LOG.debug("Finding WireTransferV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV006 create(WireTransferV006 entity) {
        LOG.info("Creating WireTransferV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV006 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV006 update(Long id, WireTransferV006 entity) {
        LOG.info("Updating WireTransferV006 id: {}", id);
        WireTransferV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV006 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV006", id.toString());
    }
}
