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
 * CreditBureauRequestV016Service — Business logic for CreditBureauRequestV016 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV016Service.class);

    @Inject
    private CreditBureauRequestV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV016> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV016 create(CreditBureauRequestV016 entity) {
        LOG.info("Creating CreditBureauRequestV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV016 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV016 update(Long id, CreditBureauRequestV016 entity) {
        LOG.info("Updating CreditBureauRequestV016 id: {}", id);
        CreditBureauRequestV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV016 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV016", id.toString());
    }
}
