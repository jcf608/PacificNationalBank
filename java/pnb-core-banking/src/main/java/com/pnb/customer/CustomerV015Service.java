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
 * CustomerV015Service — Business logic for CustomerV015 operations.
 */
@ApplicationScoped
public class CustomerV015Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV015Service.class);

    @Inject
    private CustomerV015Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV015> findById(Long id) {
        LOG.debug("Finding CustomerV015 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV015> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV015 create(CustomerV015 entity) {
        LOG.info("Creating CustomerV015");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV015 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV015", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV015 update(Long id, CustomerV015 entity) {
        LOG.info("Updating CustomerV015 id: {}", id);
        CustomerV015 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV015 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV015 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV015", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV015 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV015", id.toString());
    }
}
