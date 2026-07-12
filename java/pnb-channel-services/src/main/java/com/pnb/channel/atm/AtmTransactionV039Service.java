package com.pnb.channel.atm;

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
 * AtmTransactionV039Service — Business logic for AtmTransactionV039 operations.
 */
@ApplicationScoped
public class AtmTransactionV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV039Service.class);

    @Inject
    private AtmTransactionV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV039> findById(Long id) {
        LOG.debug("Finding AtmTransactionV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV039 create(AtmTransactionV039 entity) {
        LOG.info("Creating AtmTransactionV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV039 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV039 update(Long id, AtmTransactionV039 entity) {
        LOG.info("Updating AtmTransactionV039 id: {}", id);
        AtmTransactionV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV039 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV039", id.toString());
    }
}
