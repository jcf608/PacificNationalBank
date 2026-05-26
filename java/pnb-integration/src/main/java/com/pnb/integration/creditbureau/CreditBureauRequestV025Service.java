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
 * CreditBureauRequestV025Service — Business logic for CreditBureauRequestV025 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV025Service.class);

    @Inject
    private CreditBureauRequestV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV025> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV025 create(CreditBureauRequestV025 entity) {
        LOG.info("Creating CreditBureauRequestV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV025 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV025 update(Long id, CreditBureauRequestV025 entity) {
        LOG.info("Updating CreditBureauRequestV025 id: {}", id);
        CreditBureauRequestV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV025 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV025", id.toString());
    }
}
