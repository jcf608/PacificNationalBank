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
 * CreditBureauRequestV006Service — Business logic for CreditBureauRequestV006 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV006Service.class);

    @Inject
    private CreditBureauRequestV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV006> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV006 create(CreditBureauRequestV006 entity) {
        LOG.info("Creating CreditBureauRequestV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV006 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV006 update(Long id, CreditBureauRequestV006 entity) {
        LOG.info("Updating CreditBureauRequestV006 id: {}", id);
        CreditBureauRequestV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV006 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV006", id.toString());
    }
}
