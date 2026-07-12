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
 * CreditBureauRequestV007Service — Business logic for CreditBureauRequestV007 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV007Service.class);

    @Inject
    private CreditBureauRequestV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV007> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV007 create(CreditBureauRequestV007 entity) {
        LOG.info("Creating CreditBureauRequestV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV007 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV007 update(Long id, CreditBureauRequestV007 entity) {
        LOG.info("Updating CreditBureauRequestV007 id: {}", id);
        CreditBureauRequestV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV007 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV007", id.toString());
    }
}
