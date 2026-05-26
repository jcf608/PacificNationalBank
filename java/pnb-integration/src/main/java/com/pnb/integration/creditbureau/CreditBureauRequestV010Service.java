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
 * CreditBureauRequestV010Service — Business logic for CreditBureauRequestV010 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV010Service.class);

    @Inject
    private CreditBureauRequestV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV010> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV010 create(CreditBureauRequestV010 entity) {
        LOG.info("Creating CreditBureauRequestV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV010 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV010 update(Long id, CreditBureauRequestV010 entity) {
        LOG.info("Updating CreditBureauRequestV010 id: {}", id);
        CreditBureauRequestV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV010 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV010", id.toString());
    }
}
