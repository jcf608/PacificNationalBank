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
 * CustomerV016Service — Business logic for CustomerV016 operations.
 */
@ApplicationScoped
public class CustomerV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV016Service.class);

    @Inject
    private CustomerV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV016> findById(Long id) {
        LOG.debug("Finding CustomerV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV016 create(CustomerV016 entity) {
        LOG.info("Creating CustomerV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV016 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV016 update(Long id, CustomerV016 entity) {
        LOG.info("Updating CustomerV016 id: {}", id);
        CustomerV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV016 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV016", id.toString());
    }
}
