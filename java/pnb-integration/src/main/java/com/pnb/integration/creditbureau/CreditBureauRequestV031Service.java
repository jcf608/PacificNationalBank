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
 * CreditBureauRequestV031Service — Business logic for CreditBureauRequestV031 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV031Service.class);

    @Inject
    private CreditBureauRequestV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV031> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV031 create(CreditBureauRequestV031 entity) {
        LOG.info("Creating CreditBureauRequestV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV031 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV031 update(Long id, CreditBureauRequestV031 entity) {
        LOG.info("Updating CreditBureauRequestV031 id: {}", id);
        CreditBureauRequestV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV031 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV031", id.toString());
    }
}
