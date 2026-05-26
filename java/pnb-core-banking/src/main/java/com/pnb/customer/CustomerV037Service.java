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
 * CustomerV037Service — Business logic for CustomerV037 operations.
 */
@ApplicationScoped
public class CustomerV037Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV037Service.class);

    @Inject
    private CustomerV037Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV037> findById(Long id) {
        LOG.debug("Finding CustomerV037 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV037> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV037 create(CustomerV037 entity) {
        LOG.info("Creating CustomerV037");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV037 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV037", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV037 update(Long id, CustomerV037 entity) {
        LOG.info("Updating CustomerV037 id: {}", id);
        CustomerV037 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV037 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV037 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV037", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV037 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV037", id.toString());
    }
}
