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
 * WireTransferV017Service — Business logic for WireTransferV017 operations.
 */
@ApplicationScoped
public class WireTransferV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV017Service.class);

    @Inject
    private WireTransferV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV017> findById(Long id) {
        LOG.debug("Finding WireTransferV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV017 create(WireTransferV017 entity) {
        LOG.info("Creating WireTransferV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV017 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV017 update(Long id, WireTransferV017 entity) {
        LOG.info("Updating WireTransferV017 id: {}", id);
        WireTransferV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV017 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV017", id.toString());
    }
}
