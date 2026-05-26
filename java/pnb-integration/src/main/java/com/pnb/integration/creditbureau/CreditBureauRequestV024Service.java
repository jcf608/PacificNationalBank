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
 * CreditBureauRequestV024Service — Business logic for CreditBureauRequestV024 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV024Service.class);

    @Inject
    private CreditBureauRequestV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV024> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV024 create(CreditBureauRequestV024 entity) {
        LOG.info("Creating CreditBureauRequestV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV024 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV024 update(Long id, CreditBureauRequestV024 entity) {
        LOG.info("Updating CreditBureauRequestV024 id: {}", id);
        CreditBureauRequestV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV024 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV024", id.toString());
    }
}
