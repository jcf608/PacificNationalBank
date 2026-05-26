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
 * CreditBureauRequestV032Service — Business logic for CreditBureauRequestV032 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV032Service.class);

    @Inject
    private CreditBureauRequestV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV032> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV032 create(CreditBureauRequestV032 entity) {
        LOG.info("Creating CreditBureauRequestV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV032 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV032 update(Long id, CreditBureauRequestV032 entity) {
        LOG.info("Updating CreditBureauRequestV032 id: {}", id);
        CreditBureauRequestV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV032 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV032", id.toString());
    }
}
