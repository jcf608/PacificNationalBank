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
 * AtmTransactionV011Service — Business logic for AtmTransactionV011 operations.
 */
@ApplicationScoped
public class AtmTransactionV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV011Service.class);

    @Inject
    private AtmTransactionV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV011> findById(Long id) {
        LOG.debug("Finding AtmTransactionV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV011 create(AtmTransactionV011 entity) {
        LOG.info("Creating AtmTransactionV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV011 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV011 update(Long id, AtmTransactionV011 entity) {
        LOG.info("Updating AtmTransactionV011 id: {}", id);
        AtmTransactionV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV011 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV011", id.toString());
    }
}
