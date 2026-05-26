package com.pnb.integration.creditbureau;

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
 * CreditBureauRequestV026Service — Business logic for CreditBureauRequestV026 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV026Service.class);

    @Inject
    private CreditBureauRequestV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV026> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV026 create(CreditBureauRequestV026 entity) {
        LOG.info("Creating CreditBureauRequestV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV026 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV026 update(Long id, CreditBureauRequestV026 entity) {
        LOG.info("Updating CreditBureauRequestV026 id: {}", id);
        CreditBureauRequestV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV026 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV026", id.toString());
    }
}
