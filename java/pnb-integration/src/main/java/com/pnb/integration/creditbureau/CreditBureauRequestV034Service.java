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
 * CreditBureauRequestV034Service — Business logic for CreditBureauRequestV034 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV034Service.class);

    @Inject
    private CreditBureauRequestV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV034> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV034 create(CreditBureauRequestV034 entity) {
        LOG.info("Creating CreditBureauRequestV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV034 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV034 update(Long id, CreditBureauRequestV034 entity) {
        LOG.info("Updating CreditBureauRequestV034 id: {}", id);
        CreditBureauRequestV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV034 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV034", id.toString());
    }
}
