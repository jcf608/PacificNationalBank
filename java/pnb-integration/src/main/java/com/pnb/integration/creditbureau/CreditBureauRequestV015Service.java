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
 * CreditBureauRequestV015Service — Business logic for CreditBureauRequestV015 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV015Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV015Service.class);

    @Inject
    private CreditBureauRequestV015Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV015> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV015 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV015> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV015 create(CreditBureauRequestV015 entity) {
        LOG.info("Creating CreditBureauRequestV015");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV015 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV015", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV015 update(Long id, CreditBureauRequestV015 entity) {
        LOG.info("Updating CreditBureauRequestV015 id: {}", id);
        CreditBureauRequestV015 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV015 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV015 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV015", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV015 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV015", id.toString());
    }
}
