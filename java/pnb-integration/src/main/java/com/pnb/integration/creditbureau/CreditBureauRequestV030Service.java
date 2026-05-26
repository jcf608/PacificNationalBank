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
 * CreditBureauRequestV030Service — Business logic for CreditBureauRequestV030 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV030Service.class);

    @Inject
    private CreditBureauRequestV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV030> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV030 create(CreditBureauRequestV030 entity) {
        LOG.info("Creating CreditBureauRequestV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV030 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV030 update(Long id, CreditBureauRequestV030 entity) {
        LOG.info("Updating CreditBureauRequestV030 id: {}", id);
        CreditBureauRequestV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV030 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV030", id.toString());
    }
}
