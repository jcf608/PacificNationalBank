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
 * CustomerV014Service — Business logic for CustomerV014 operations.
 */
@ApplicationScoped
public class CustomerV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV014Service.class);

    @Inject
    private CustomerV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV014> findById(Long id) {
        LOG.debug("Finding CustomerV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV014 create(CustomerV014 entity) {
        LOG.info("Creating CustomerV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV014 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV014 update(Long id, CustomerV014 entity) {
        LOG.info("Updating CustomerV014 id: {}", id);
        CustomerV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV014 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV014", id.toString());
    }
}
