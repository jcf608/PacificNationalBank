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
 * CreditBureauRequestV043Service — Business logic for CreditBureauRequestV043 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV043Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV043Service.class);

    @Inject
    private CreditBureauRequestV043Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV043> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV043 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV043> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV043 create(CreditBureauRequestV043 entity) {
        LOG.info("Creating CreditBureauRequestV043");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV043 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV043", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV043 update(Long id, CreditBureauRequestV043 entity) {
        LOG.info("Updating CreditBureauRequestV043 id: {}", id);
        CreditBureauRequestV043 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV043 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV043 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV043", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV043 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV043", id.toString());
    }
}
