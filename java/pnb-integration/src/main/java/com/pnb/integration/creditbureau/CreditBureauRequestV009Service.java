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
 * CreditBureauRequestV009Service — Business logic for CreditBureauRequestV009 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV009Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV009Service.class);

    @Inject
    private CreditBureauRequestV009Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV009> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV009 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV009> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV009 create(CreditBureauRequestV009 entity) {
        LOG.info("Creating CreditBureauRequestV009");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV009 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV009", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV009 update(Long id, CreditBureauRequestV009 entity) {
        LOG.info("Updating CreditBureauRequestV009 id: {}", id);
        CreditBureauRequestV009 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV009 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV009 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV009", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV009 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV009", id.toString());
    }
}
