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
 * CustomerV008Service — Business logic for CustomerV008 operations.
 */
@ApplicationScoped
public class CustomerV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV008Service.class);

    @Inject
    private CustomerV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV008> findById(Long id) {
        LOG.debug("Finding CustomerV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV008 create(CustomerV008 entity) {
        LOG.info("Creating CustomerV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV008 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV008 update(Long id, CustomerV008 entity) {
        LOG.info("Updating CustomerV008 id: {}", id);
        CustomerV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV008 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV008", id.toString());
    }
}
