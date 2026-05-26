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
 * WireTransferV041Service — Business logic for WireTransferV041 operations.
 */
@ApplicationScoped
public class WireTransferV041Service {

    private static final Logger LOG = LoggerFactory.getLogger(WireTransferV041Service.class);

    @Inject
    private WireTransferV041Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<WireTransferV041> findById(Long id) {
        LOG.debug("Finding WireTransferV041 by id: {}", id);
        return repository.findById(id);
    }

    public List<WireTransferV041> findAll() {
        return repository.findAll();
    }

    @Transactional
    public WireTransferV041 create(WireTransferV041 entity) {
        LOG.info("Creating WireTransferV041");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV041 saved = repository.save(entity);
        auditService.log("CREATE", "WireTransferV041", saved.getId().toString());
        return saved;
    }

    @Transactional
    public WireTransferV041 update(Long id, WireTransferV041 entity) {
        LOG.info("Updating WireTransferV041 id: {}", id);
        WireTransferV041 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("WireTransferV041 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        WireTransferV041 updated = repository.save(entity);
        auditService.log("UPDATE", "WireTransferV041", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting WireTransferV041 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "WireTransferV041", id.toString());
    }
}
