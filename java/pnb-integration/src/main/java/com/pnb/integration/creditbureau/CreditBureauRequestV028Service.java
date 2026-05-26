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
 * CreditBureauRequestV028Service — Business logic for CreditBureauRequestV028 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV028Service.class);

    @Inject
    private CreditBureauRequestV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV028> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV028 create(CreditBureauRequestV028 entity) {
        LOG.info("Creating CreditBureauRequestV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV028 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV028 update(Long id, CreditBureauRequestV028 entity) {
        LOG.info("Updating CreditBureauRequestV028 id: {}", id);
        CreditBureauRequestV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV028 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV028", id.toString());
    }
}
