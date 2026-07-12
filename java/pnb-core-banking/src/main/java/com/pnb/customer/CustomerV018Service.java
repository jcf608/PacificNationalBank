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
 * CustomerV018Service — Business logic for CustomerV018 operations.
 */
@ApplicationScoped
public class CustomerV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV018Service.class);

    @Inject
    private CustomerV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV018> findById(Long id) {
        LOG.debug("Finding CustomerV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV018 create(CustomerV018 entity) {
        LOG.info("Creating CustomerV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV018 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV018 update(Long id, CustomerV018 entity) {
        LOG.info("Updating CustomerV018 id: {}", id);
        CustomerV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV018 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV018", id.toString());
    }
}
