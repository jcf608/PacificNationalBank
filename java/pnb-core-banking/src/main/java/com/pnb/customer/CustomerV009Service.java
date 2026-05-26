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
 * CustomerV009Service — Business logic for CustomerV009 operations.
 */
@ApplicationScoped
public class CustomerV009Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV009Service.class);

    @Inject
    private CustomerV009Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV009> findById(Long id) {
        LOG.debug("Finding CustomerV009 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV009> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV009 create(CustomerV009 entity) {
        LOG.info("Creating CustomerV009");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV009 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV009", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV009 update(Long id, CustomerV009 entity) {
        LOG.info("Updating CustomerV009 id: {}", id);
        CustomerV009 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV009 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV009 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV009", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV009 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV009", id.toString());
    }
}
