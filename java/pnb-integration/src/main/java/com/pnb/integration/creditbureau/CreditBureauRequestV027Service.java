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
 * CreditBureauRequestV027Service — Business logic for CreditBureauRequestV027 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV027Service.class);

    @Inject
    private CreditBureauRequestV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV027> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV027 create(CreditBureauRequestV027 entity) {
        LOG.info("Creating CreditBureauRequestV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV027 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV027 update(Long id, CreditBureauRequestV027 entity) {
        LOG.info("Updating CreditBureauRequestV027 id: {}", id);
        CreditBureauRequestV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV027 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV027", id.toString());
    }
}
