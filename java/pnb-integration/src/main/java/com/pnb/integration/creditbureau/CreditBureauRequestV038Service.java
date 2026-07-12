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
 * CreditBureauRequestV038Service — Business logic for CreditBureauRequestV038 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV038Service.class);

    @Inject
    private CreditBureauRequestV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV038> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV038 create(CreditBureauRequestV038 entity) {
        LOG.info("Creating CreditBureauRequestV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV038 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV038 update(Long id, CreditBureauRequestV038 entity) {
        LOG.info("Updating CreditBureauRequestV038 id: {}", id);
        CreditBureauRequestV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV038 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV038", id.toString());
    }
}
