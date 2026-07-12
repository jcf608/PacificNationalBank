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
 * CustomerV007Service — Business logic for CustomerV007 operations.
 */
@ApplicationScoped
public class CustomerV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV007Service.class);

    @Inject
    private CustomerV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV007> findById(Long id) {
        LOG.debug("Finding CustomerV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV007 create(CustomerV007 entity) {
        LOG.info("Creating CustomerV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV007 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV007 update(Long id, CustomerV007 entity) {
        LOG.info("Updating CustomerV007 id: {}", id);
        CustomerV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV007 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV007", id.toString());
    }
}
