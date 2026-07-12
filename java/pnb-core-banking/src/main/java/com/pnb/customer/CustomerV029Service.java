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
 * CustomerV029Service — Business logic for CustomerV029 operations.
 */
@ApplicationScoped
public class CustomerV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV029Service.class);

    @Inject
    private CustomerV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV029> findById(Long id) {
        LOG.debug("Finding CustomerV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV029 create(CustomerV029 entity) {
        LOG.info("Creating CustomerV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV029 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV029 update(Long id, CustomerV029 entity) {
        LOG.info("Updating CustomerV029 id: {}", id);
        CustomerV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV029 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV029", id.toString());
    }
}
