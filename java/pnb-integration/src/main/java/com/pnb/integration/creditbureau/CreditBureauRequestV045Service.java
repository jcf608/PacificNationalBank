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
 * CreditBureauRequestV045Service — Business logic for CreditBureauRequestV045 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV045Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV045Service.class);

    @Inject
    private CreditBureauRequestV045Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV045> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV045 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV045> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV045 create(CreditBureauRequestV045 entity) {
        LOG.info("Creating CreditBureauRequestV045");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV045 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV045", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV045 update(Long id, CreditBureauRequestV045 entity) {
        LOG.info("Updating CreditBureauRequestV045 id: {}", id);
        CreditBureauRequestV045 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV045 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV045 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV045", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV045 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV045", id.toString());
    }
}
