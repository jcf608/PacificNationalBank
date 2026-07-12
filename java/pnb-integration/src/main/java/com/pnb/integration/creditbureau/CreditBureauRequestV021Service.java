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
 * CreditBureauRequestV021Service — Business logic for CreditBureauRequestV021 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV021Service.class);

    @Inject
    private CreditBureauRequestV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV021> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV021 create(CreditBureauRequestV021 entity) {
        LOG.info("Creating CreditBureauRequestV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV021 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV021 update(Long id, CreditBureauRequestV021 entity) {
        LOG.info("Updating CreditBureauRequestV021 id: {}", id);
        CreditBureauRequestV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV021 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV021", id.toString());
    }
}
