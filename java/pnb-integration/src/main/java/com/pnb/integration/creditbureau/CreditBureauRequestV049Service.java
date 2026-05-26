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
 * CreditBureauRequestV049Service — Business logic for CreditBureauRequestV049 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV049Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV049Service.class);

    @Inject
    private CreditBureauRequestV049Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV049> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV049 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV049> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV049 create(CreditBureauRequestV049 entity) {
        LOG.info("Creating CreditBureauRequestV049");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV049 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV049", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV049 update(Long id, CreditBureauRequestV049 entity) {
        LOG.info("Updating CreditBureauRequestV049 id: {}", id);
        CreditBureauRequestV049 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV049 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV049 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV049", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV049 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV049", id.toString());
    }
}
