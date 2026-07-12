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
 * CreditBureauRequestV042Service — Business logic for CreditBureauRequestV042 operations.
 */
@ApplicationScoped
public class CreditBureauRequestV042Service {

    private static final Logger LOG = LoggerFactory.getLogger(CreditBureauRequestV042Service.class);

    @Inject
    private CreditBureauRequestV042Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CreditBureauRequestV042> findById(Long id) {
        LOG.debug("Finding CreditBureauRequestV042 by id: {}", id);
        return repository.findById(id);
    }

    public List<CreditBureauRequestV042> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CreditBureauRequestV042 create(CreditBureauRequestV042 entity) {
        LOG.info("Creating CreditBureauRequestV042");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV042 saved = repository.save(entity);
        auditService.log("CREATE", "CreditBureauRequestV042", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CreditBureauRequestV042 update(Long id, CreditBureauRequestV042 entity) {
        LOG.info("Updating CreditBureauRequestV042 id: {}", id);
        CreditBureauRequestV042 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CreditBureauRequestV042 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CreditBureauRequestV042 updated = repository.save(entity);
        auditService.log("UPDATE", "CreditBureauRequestV042", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CreditBureauRequestV042 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CreditBureauRequestV042", id.toString());
    }
}
