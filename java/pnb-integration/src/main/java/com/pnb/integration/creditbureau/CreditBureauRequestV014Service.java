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
 * CreditBureauRequestV014Service — Business logic for CreditBureauRequestV014 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV014Service.class);

    @Inject
    private CreditBureauRequestV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV014> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV014 create(CreditBureauRequestV014 entity) {
        LOG.info("Creating CreditBureauRequestV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV014 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV014 update(Long id, CreditBureauRequestV014 entity) {
        LOG.info("Updating CreditBureauRequestV014 id: {}", id);
        CreditBureauRequestV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV014 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV014", id.toString());
    }
}
