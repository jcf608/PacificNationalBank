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
 * CustomerV001Service — Business logic for CustomerV001 operations.
 */
@ApplicationScoped
public class CustomerV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV001Service.class);

    @Inject
    private CustomerV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV001> findById(Long id) {
        LOG.debug("Finding CustomerV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV001 create(CustomerV001 entity) {
        LOG.info("Creating CustomerV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV001 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV001 update(Long id, CustomerV001 entity) {
        LOG.info("Updating CustomerV001 id: {}", id);
        CustomerV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV001 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV001", id.toString());
    }
}
