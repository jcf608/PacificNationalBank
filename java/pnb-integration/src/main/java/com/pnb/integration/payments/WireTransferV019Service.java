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
 * WireTransferV019Service — Business logic for WireTransferV019 operations.
 */
@ApplicationScoped
public class WireTransferV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV019Service.class);

    @Inject
    private WireTransferV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV019> findById(Long id) {
        LOG.debug("Finding WireTransferV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV019 create(WireTransferV019 entity) {
        LOG.info("Creating WireTransferV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV019 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV019 update(Long id, WireTransferV019 entity) {
        LOG.info("Updating WireTransferV019 id: {}", id);
        WireTransferV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV019 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV019", id.toString());
    }
}
