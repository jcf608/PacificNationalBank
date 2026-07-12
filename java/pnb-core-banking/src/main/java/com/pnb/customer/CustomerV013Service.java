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
 * CustomerV013Service — Business logic for CustomerV013 operations.
 */
@ApplicationScoped
public class CustomerV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV013Service.class);

    @Inject
    private CustomerV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV013> findById(Long id) {
        LOG.debug("Finding CustomerV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV013 create(CustomerV013 entity) {
        LOG.info("Creating CustomerV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV013 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV013 update(Long id, CustomerV013 entity) {
        LOG.info("Updating CustomerV013 id: {}", id);
        CustomerV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV013 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV013", id.toString());
    }
}
