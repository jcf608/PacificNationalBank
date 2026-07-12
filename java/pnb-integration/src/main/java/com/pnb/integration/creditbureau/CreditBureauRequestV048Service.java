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
 * CreditBureauRequestV048Service — Business logic for CreditBureauRequestV048 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV048Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV048Service.class);

    @Inject
    private CreditBureauRequestV048Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV048> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV048 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV048> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV048 create(CreditBureauRequestV048 entity) {
        LOG.info("Creating CreditBureauRequestV048");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV048 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV048", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV048 update(Long id, CreditBureauRequestV048 entity) {
        LOG.info("Updating CreditBureauRequestV048 id: {}", id);
        CreditBureauRequestV048 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV048 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV048 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV048", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV048 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV048", id.toString());
    }
}
