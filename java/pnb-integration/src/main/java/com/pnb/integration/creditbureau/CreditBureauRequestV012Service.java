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
 * CreditBureauRequestV012Service — Business logic for CreditBureauRequestV012 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV012Service.class);

    @Inject
    private CreditBureauRequestV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV012> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV012 create(CreditBureauRequestV012 entity) {
        LOG.info("Creating CreditBureauRequestV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV012 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV012 update(Long id, CreditBureauRequestV012 entity) {
        LOG.info("Updating CreditBureauRequestV012 id: {}", id);
        CreditBureauRequestV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV012 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV012", id.toString());
    }
}
