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
 * CustomerV005Service — Business logic for CustomerV005 operations.
 */
@ApplicationScoped
public class CustomerV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV005Service.class);

    @Inject
    private CustomerV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV005> findById(Long id) {
        LOG.debug("Finding CustomerV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV005 create(CustomerV005 entity) {
        LOG.info("Creating CustomerV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV005 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV005 update(Long id, CustomerV005 entity) {
        LOG.info("Updating CustomerV005 id: {}", id);
        CustomerV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV005 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV005", id.toString());
    }
}
