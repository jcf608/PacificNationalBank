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
 * CreditBureauRequestV044Service — Business logic for CreditBureauRequestV044 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV044Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV044Service.class);

    @Inject
    private CreditBureauRequestV044Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV044> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV044 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV044> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV044 create(CreditBureauRequestV044 entity) {
        LOG.info("Creating CreditBureauRequestV044");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV044 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV044", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV044 update(Long id, CreditBureauRequestV044 entity) {
        LOG.info("Updating CreditBureauRequestV044 id: {}", id);
        CreditBureauRequestV044 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV044 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV044 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV044", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV044 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV044", id.toString());
    }
}
