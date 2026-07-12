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
 * CustomerV003Service — Business logic for CustomerV003 operations.
 */
@ApplicationScoped
public class CustomerV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV003Service.class);

    @Inject
    private CustomerV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV003> findById(Long id) {
        LOG.debug("Finding CustomerV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV003 create(CustomerV003 entity) {
        LOG.info("Creating CustomerV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV003 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV003 update(Long id, CustomerV003 entity) {
        LOG.info("Updating CustomerV003 id: {}", id);
        CustomerV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV003 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV003", id.toString());
    }
}
