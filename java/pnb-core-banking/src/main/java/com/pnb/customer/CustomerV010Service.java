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
 * CustomerV010Service — Business logic for CustomerV010 operations.
 */
@ApplicationScoped
public class CustomerV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV010Service.class);

    @Inject
    private CustomerV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV010> findById(Long id) {
        LOG.debug("Finding CustomerV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV010 create(CustomerV010 entity) {
        LOG.info("Creating CustomerV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV010 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV010 update(Long id, CustomerV010 entity) {
        LOG.info("Updating CustomerV010 id: {}", id);
        CustomerV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV010 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV010", id.toString());
    }
}
