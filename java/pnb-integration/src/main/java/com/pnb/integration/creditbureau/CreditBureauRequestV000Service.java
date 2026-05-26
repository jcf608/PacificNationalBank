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
 * CreditBureauRequestV000Service — Business logic for CreditBureauRequestV000 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV000Service.class);

    @Inject
    private CreditBureauRequestV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV000> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV000 create(CreditBureauRequestV000 entity) {
        LOG.info("Creating CreditBureauRequestV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV000 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV000 update(Long id, CreditBureauRequestV000 entity) {
        LOG.info("Updating CreditBureauRequestV000 id: {}", id);
        CreditBureauRequestV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV000 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV000", id.toString());
    }
}
