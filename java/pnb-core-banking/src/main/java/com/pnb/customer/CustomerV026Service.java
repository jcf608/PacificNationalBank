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
 * CustomerV026Service — Business logic for CustomerV026 operations.
 */
@ApplicationScoped
public class CustomerV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV026Service.class);

    @Inject
    private CustomerV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV026> findById(Long id) {
        LOG.debug("Finding CustomerV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV026 create(CustomerV026 entity) {
        LOG.info("Creating CustomerV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV026 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV026 update(Long id, CustomerV026 entity) {
        LOG.info("Updating CustomerV026 id: {}", id);
        CustomerV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV026 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV026", id.toString());
    }
}
