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
 * CreditBureauRequestV039Service — Business logic for CreditBureauRequestV039 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV039Service.class);

    @Inject
    private CreditBureauRequestV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV039> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV039 create(CreditBureauRequestV039 entity) {
        LOG.info("Creating CreditBureauRequestV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV039 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV039 update(Long id, CreditBureauRequestV039 entity) {
        LOG.info("Updating CreditBureauRequestV039 id: {}", id);
        CreditBureauRequestV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV039 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV039", id.toString());
    }
}
