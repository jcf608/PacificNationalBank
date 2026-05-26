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
 * CreditBureauRequestV017Service — Business logic for CreditBureauRequestV017 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV017Service.class);

    @Inject
    private CreditBureauRequestV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV017> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV017 create(CreditBureauRequestV017 entity) {
        LOG.info("Creating CreditBureauRequestV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV017 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV017 update(Long id, CreditBureauRequestV017 entity) {
        LOG.info("Updating CreditBureauRequestV017 id: {}", id);
        CreditBureauRequestV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV017 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV017", id.toString());
    }
}
