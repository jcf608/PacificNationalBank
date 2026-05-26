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
 * CreditBureauRequestV008Service — Business logic for CreditBureauRequestV008 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV008Service.class);

    @Inject
    private CreditBureauRequestV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV008> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV008 create(CreditBureauRequestV008 entity) {
        LOG.info("Creating CreditBureauRequestV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV008 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV008 update(Long id, CreditBureauRequestV008 entity) {
        LOG.info("Updating CreditBureauRequestV008 id: {}", id);
        CreditBureauRequestV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV008 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV008", id.toString());
    }
}
