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
 * CustomerV034Service — Business logic for CustomerV034 operations.
 */
@ApplicationScoped
public class CustomerV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV034Service.class);

    @Inject
    private CustomerV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV034> findById(Long id) {
        LOG.debug("Finding CustomerV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV034 create(CustomerV034 entity) {
        LOG.info("Creating CustomerV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV034 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV034 update(Long id, CustomerV034 entity) {
        LOG.info("Updating CustomerV034 id: {}", id);
        CustomerV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV034 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV034", id.toString());
    }
}
