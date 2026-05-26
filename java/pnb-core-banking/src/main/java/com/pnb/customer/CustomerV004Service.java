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
 * CustomerV004Service — Business logic for CustomerV004 operations.
 */
@ApplicationScoped
public class CustomerV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV004Service.class);

    @Inject
    private CustomerV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV004> findById(Long id) {
        LOG.debug("Finding CustomerV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV004 create(CustomerV004 entity) {
        LOG.info("Creating CustomerV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV004 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV004 update(Long id, CustomerV004 entity) {
        LOG.info("Updating CustomerV004 id: {}", id);
        CustomerV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV004 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV004", id.toString());
    }
}
