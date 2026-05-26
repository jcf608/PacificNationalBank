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
 * CustomerV033Service — Business logic for CustomerV033 operations.
 */
@ApplicationScoped
public class CustomerV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV033Service.class);

    @Inject
    private CustomerV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV033> findById(Long id) {
        LOG.debug("Finding CustomerV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV033 create(CustomerV033 entity) {
        LOG.info("Creating CustomerV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV033 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV033 update(Long id, CustomerV033 entity) {
        LOG.info("Updating CustomerV033 id: {}", id);
        CustomerV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV033 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV033", id.toString());
    }
}
