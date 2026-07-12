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
 * WireTransferV021Service — Business logic for WireTransferV021 operations.
 */
@ApplicationScoped
public class WireTransferV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV021Service.class);

    @Inject
    private WireTransferV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV021> findById(Long id) {
        LOG.debug("Finding WireTransferV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV021 create(WireTransferV021 entity) {
        LOG.info("Creating WireTransferV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV021 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV021 update(Long id, WireTransferV021 entity) {
        LOG.info("Updating WireTransferV021 id: {}", id);
        WireTransferV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV021 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV021", id.toString());
    }
}
