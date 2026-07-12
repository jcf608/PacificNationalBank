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
 * CustomerV024Service — Business logic for CustomerV024 operations.
 */
@ApplicationScoped
public class CustomerV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV024Service.class);

    @Inject
    private CustomerV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV024> findById(Long id) {
        LOG.debug("Finding CustomerV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV024 create(CustomerV024 entity) {
        LOG.info("Creating CustomerV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV024 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV024 update(Long id, CustomerV024 entity) {
        LOG.info("Updating CustomerV024 id: {}", id);
        CustomerV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV024 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV024", id.toString());
    }
}
