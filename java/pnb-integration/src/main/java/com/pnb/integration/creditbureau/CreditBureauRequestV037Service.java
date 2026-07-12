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
 * CreditBureauRequestV037Service — Business logic for CreditBureauRequestV037 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV037Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV037Service.class);

    @Inject
    private CreditBureauRequestV037Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV037> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV037 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV037> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV037 create(CreditBureauRequestV037 entity) {
        LOG.info("Creating CreditBureauRequestV037");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV037 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV037", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV037 update(Long id, CreditBureauRequestV037 entity) {
        LOG.info("Updating CreditBureauRequestV037 id: {}", id);
        CreditBureauRequestV037 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV037 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV037 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV037", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV037 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV037", id.toString());
    }
}
