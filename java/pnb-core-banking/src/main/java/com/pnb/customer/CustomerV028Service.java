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
 * CustomerV028Service — Business logic for CustomerV028 operations.
 */
@ApplicationScoped
public class CustomerV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV028Service.class);

    @Inject
    private CustomerV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV028> findById(Long id) {
        LOG.debug("Finding CustomerV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV028 create(CustomerV028 entity) {
        LOG.info("Creating CustomerV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV028 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV028 update(Long id, CustomerV028 entity) {
        LOG.info("Updating CustomerV028 id: {}", id);
        CustomerV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV028 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV028", id.toString());
    }
}
