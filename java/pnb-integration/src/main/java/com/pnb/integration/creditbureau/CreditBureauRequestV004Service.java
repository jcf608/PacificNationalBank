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
 * CreditBureauRequestV004Service — Business logic for CreditBureauRequestV004 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV004Service.class);

    @Inject
    private CreditBureauRequestV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV004> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV004 create(CreditBureauRequestV004 entity) {
        LOG.info("Creating CreditBureauRequestV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV004 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV004 update(Long id, CreditBureauRequestV004 entity) {
        LOG.info("Updating CreditBureauRequestV004 id: {}", id);
        CreditBureauRequestV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV004 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV004", id.toString());
    }
}
