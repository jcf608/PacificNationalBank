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
 * CreditBureauRequestV029Service — Business logic for CreditBureauRequestV029 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV029Service.class);

    @Inject
    private CreditBureauRequestV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV029> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV029 create(CreditBureauRequestV029 entity) {
        LOG.info("Creating CreditBureauRequestV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV029 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV029 update(Long id, CreditBureauRequestV029 entity) {
        LOG.info("Updating CreditBureauRequestV029 id: {}", id);
        CreditBureauRequestV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV029 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV029", id.toString());
    }
}
