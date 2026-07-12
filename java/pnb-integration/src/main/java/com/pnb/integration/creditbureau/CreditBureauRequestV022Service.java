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
 * CreditBureauRequestV022Service — Business logic for CreditBureauRequestV022 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV022Service.class);

    @Inject
    private CreditBureauRequestV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV022> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV022 create(CreditBureauRequestV022 entity) {
        LOG.info("Creating CreditBureauRequestV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV022 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV022 update(Long id, CreditBureauRequestV022 entity) {
        LOG.info("Updating CreditBureauRequestV022 id: {}", id);
        CreditBureauRequestV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV022 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV022", id.toString());
    }
}
