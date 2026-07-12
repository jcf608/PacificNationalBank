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
 * CreditBureauRequestV018Service — Business logic for CreditBureauRequestV018 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV018Service.class);

    @Inject
    private CreditBureauRequestV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV018> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV018 create(CreditBureauRequestV018 entity) {
        LOG.info("Creating CreditBureauRequestV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV018 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV018 update(Long id, CreditBureauRequestV018 entity) {
        LOG.info("Updating CreditBureauRequestV018 id: {}", id);
        CreditBureauRequestV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV018 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV018", id.toString());
    }
}
