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
 * CreditBureauRequestV047Service — Business logic for CreditBureauRequestV047 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV047Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV047Service.class);

    @Inject
    private CreditBureauRequestV047Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV047> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV047 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV047> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV047 create(CreditBureauRequestV047 entity) {
        LOG.info("Creating CreditBureauRequestV047");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV047 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV047", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV047 update(Long id, CreditBureauRequestV047 entity) {
        LOG.info("Updating CreditBureauRequestV047 id: {}", id);
        CreditBureauRequestV047 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV047 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV047 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV047", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV047 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV047", id.toString());
    }
}
