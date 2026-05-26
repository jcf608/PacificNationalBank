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
 * CreditBureauRequestV033Service — Business logic for CreditBureauRequestV033 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV033Service.class);

    @Inject
    private CreditBureauRequestV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV033> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV033 create(CreditBureauRequestV033 entity) {
        LOG.info("Creating CreditBureauRequestV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV033 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV033 update(Long id, CreditBureauRequestV033 entity) {
        LOG.info("Updating CreditBureauRequestV033 id: {}", id);
        CreditBureauRequestV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV033 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV033", id.toString());
    }
}
