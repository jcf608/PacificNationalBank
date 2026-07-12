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
 * AtmTransactionV012Service — Business logic for AtmTransactionV012 operations.
 */
@ApplicationScoped
public class AtmTransactionV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV012Service.class);

    @Inject
    private AtmTransactionV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV012> findById(Long id) {
        LOG.debug("Finding AtmTransactionV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV012 create(AtmTransactionV012 entity) {
        LOG.info("Creating AtmTransactionV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV012 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV012 update(Long id, AtmTransactionV012 entity) {
        LOG.info("Updating AtmTransactionV012 id: {}", id);
        AtmTransactionV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV012 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV012", id.toString());
    }
}
