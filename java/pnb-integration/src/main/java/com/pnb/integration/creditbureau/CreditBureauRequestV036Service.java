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
 * CreditBureauRequestV036Service — Business logic for CreditBureauRequestV036 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV036Service.class);

    @Inject
    private CreditBureauRequestV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV036> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV036 create(CreditBureauRequestV036 entity) {
        LOG.info("Creating CreditBureauRequestV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV036 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV036 update(Long id, CreditBureauRequestV036 entity) {
        LOG.info("Updating CreditBureauRequestV036 id: {}", id);
        CreditBureauRequestV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV036 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV036", id.toString());
    }
}
