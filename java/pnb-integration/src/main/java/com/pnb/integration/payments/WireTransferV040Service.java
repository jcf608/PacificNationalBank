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
 * WireTransferV040Service — Business logic for WireTransferV040 operations.
 */
@ApplicationScoped
public class WireTransferV040Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV040Service.class);

    @Inject
    private WireTransferV040Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV040> findById(Long id) {
        LOG.debug("Finding WireTransferV040 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV040> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV040 create(WireTransferV040 entity) {
        LOG.info("Creating WireTransferV040");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV040 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV040", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV040 update(Long id, WireTransferV040 entity) {
        LOG.info("Updating WireTransferV040 id: {}", id);
        WireTransferV040 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV040 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV040 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV040", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV040 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV040", id.toString());
    }
}
