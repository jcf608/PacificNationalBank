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
 * CreditBureauRequestV002Service — Business logic for CreditBureauRequestV002 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV002Service.class);

    @Inject
    private CreditBureauRequestV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV002> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV002 create(CreditBureauRequestV002 entity) {
        LOG.info("Creating CreditBureauRequestV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV002 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV002 update(Long id, CreditBureauRequestV002 entity) {
        LOG.info("Updating CreditBureauRequestV002 id: {}", id);
        CreditBureauRequestV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV002 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV002", id.toString());
    }
}
