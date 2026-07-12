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
 * CreditBureauRequestV046Service — Business logic for CreditBureauRequestV046 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV046Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV046Service.class);

    @Inject
    private CreditBureauRequestV046Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV046> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV046 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV046> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV046 create(CreditBureauRequestV046 entity) {
        LOG.info("Creating CreditBureauRequestV046");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV046 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV046", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV046 update(Long id, CreditBureauRequestV046 entity) {
        LOG.info("Updating CreditBureauRequestV046 id: {}", id);
        CreditBureauRequestV046 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV046 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV046 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV046", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV046 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV046", id.toString());
    }
}
