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
 * CreditBureauRequestV020Service — Business logic for CreditBureauRequestV020 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV020Service.class);

    @Inject
    private CreditBureauRequestV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV020> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV020 create(CreditBureauRequestV020 entity) {
        LOG.info("Creating CreditBureauRequestV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV020 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV020 update(Long id, CreditBureauRequestV020 entity) {
        LOG.info("Updating CreditBureauRequestV020 id: {}", id);
        CreditBureauRequestV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV020 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV020", id.toString());
    }
}
