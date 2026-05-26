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
 * CustomerV038Service — Business logic for CustomerV038 operations.
 */
@ApplicationScoped
public class CustomerV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV038Service.class);

    @Inject
    private CustomerV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV038> findById(Long id) {
        LOG.debug("Finding CustomerV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV038 create(CustomerV038 entity) {
        LOG.info("Creating CustomerV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV038 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV038 update(Long id, CustomerV038 entity) {
        LOG.info("Updating CustomerV038 id: {}", id);
        CustomerV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV038 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV038", id.toString());
    }
}
