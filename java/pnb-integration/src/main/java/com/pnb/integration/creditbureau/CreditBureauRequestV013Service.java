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
 * CreditBureauRequestV013Service — Business logic for CreditBureauRequestV013 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV013Service.class);

    @Inject
    private CreditBureauRequestV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV013> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV013 create(CreditBureauRequestV013 entity) {
        LOG.info("Creating CreditBureauRequestV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV013 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV013 update(Long id, CreditBureauRequestV013 entity) {
        LOG.info("Updating CreditBureauRequestV013 id: {}", id);
        CreditBureauRequestV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV013 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV013", id.toString());
    }
}
