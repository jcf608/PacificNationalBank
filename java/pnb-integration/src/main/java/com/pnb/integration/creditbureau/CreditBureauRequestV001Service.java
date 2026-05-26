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
 * CreditBureauRequestV001Service — Business logic for CreditBureauRequestV001 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV001Service.class);

    @Inject
    private CreditBureauRequestV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV001> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV001 create(CreditBureauRequestV001 entity) {
        LOG.info("Creating CreditBureauRequestV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV001 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV001 update(Long id, CreditBureauRequestV001 entity) {
        LOG.info("Updating CreditBureauRequestV001 id: {}", id);
        CreditBureauRequestV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV001 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV001", id.toString());
    }
}
