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
 * CustomerV027Service — Business logic for CustomerV027 operations.
 */
@ApplicationScoped
public class CustomerV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV027Service.class);

    @Inject
    private CustomerV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV027> findById(Long id) {
        LOG.debug("Finding CustomerV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV027 create(CustomerV027 entity) {
        LOG.info("Creating CustomerV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV027 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV027 update(Long id, CustomerV027 entity) {
        LOG.info("Updating CustomerV027 id: {}", id);
        CustomerV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV027 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV027", id.toString());
    }
}
