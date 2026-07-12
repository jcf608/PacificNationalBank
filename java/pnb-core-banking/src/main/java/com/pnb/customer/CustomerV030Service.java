package com.pnb.customer;

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
 * CustomerV030Service — Business logic for CustomerV030 operations.
 */
@ApplicationScoped
public class CustomerV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV030Service.class);

    @Inject
    private CustomerV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV030> findById(Long id) {
        LOG.debug("Finding CustomerV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV030 create(CustomerV030 entity) {
        LOG.info("Creating CustomerV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV030 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV030 update(Long id, CustomerV030 entity) {
        LOG.info("Updating CustomerV030 id: {}", id);
        CustomerV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV030 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV030", id.toString());
    }
}
