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
 * CustomerV025Service — Business logic for CustomerV025 operations.
 */
@ApplicationScoped
public class CustomerV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV025Service.class);

    @Inject
    private CustomerV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV025> findById(Long id) {
        LOG.debug("Finding CustomerV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV025 create(CustomerV025 entity) {
        LOG.info("Creating CustomerV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV025 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV025 update(Long id, CustomerV025 entity) {
        LOG.info("Updating CustomerV025 id: {}", id);
        CustomerV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV025 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV025", id.toString());
    }
}
