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
 * WireTransferV011Service — Business logic for WireTransferV011 operations.
 */
@ApplicationScoped
public class WireTransferV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV011Service.class);

    @Inject
    private WireTransferV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV011> findById(Long id) {
        LOG.debug("Finding WireTransferV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV011 create(WireTransferV011 entity) {
        LOG.info("Creating WireTransferV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV011 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV011 update(Long id, WireTransferV011 entity) {
        LOG.info("Updating WireTransferV011 id: {}", id);
        WireTransferV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV011 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV011", id.toString());
    }
}
