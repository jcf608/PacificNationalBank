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
 * CreditBureauRequestV003Service — Business logic for CreditBureauRequestV003 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV003Service.class);

    @Inject
    private CreditBureauRequestV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV003> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV003 create(CreditBureauRequestV003 entity) {
        LOG.info("Creating CreditBureauRequestV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV003 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV003 update(Long id, CreditBureauRequestV003 entity) {
        LOG.info("Updating CreditBureauRequestV003 id: {}", id);
        CreditBureauRequestV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV003 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV003", id.toString());
    }
}
