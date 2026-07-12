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
 * CustomerV000Service — Business logic for CustomerV000 operations.
 */
@ApplicationScoped
public class CustomerV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV000Service.class);

    @Inject
    private CustomerV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV000> findById(Long id) {
        LOG.debug("Finding CustomerV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV000 create(CustomerV000 entity) {
        LOG.info("Creating CustomerV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV000 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV000 update(Long id, CustomerV000 entity) {
        LOG.info("Updating CustomerV000 id: {}", id);
        CustomerV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV000 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV000", id.toString());
    }
}
