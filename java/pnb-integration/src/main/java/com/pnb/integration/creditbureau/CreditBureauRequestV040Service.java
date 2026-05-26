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
 * CreditBureauRequestV040Service — Business logic for CreditBureauRequestV040 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV040Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV040Service.class);

    @Inject
    private CreditBureauRequestV040Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV040> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV040 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV040> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV040 create(CreditBureauRequestV040 entity) {
        LOG.info("Creating CreditBureauRequestV040");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV040 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV040", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV040 update(Long id, CreditBureauRequestV040 entity) {
        LOG.info("Updating CreditBureauRequestV040 id: {}", id);
        CreditBureauRequestV040 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV040 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV040 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV040", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV040 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV040", id.toString());
    }
}
