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
 * CustomerV036Service — Business logic for CustomerV036 operations.
 */
@ApplicationScoped
public class CustomerV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV036Service.class);

    @Inject
    private CustomerV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV036> findById(Long id) {
        LOG.debug("Finding CustomerV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV036 create(CustomerV036 entity) {
        LOG.info("Creating CustomerV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV036 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV036 update(Long id, CustomerV036 entity) {
        LOG.info("Updating CustomerV036 id: {}", id);
        CustomerV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV036 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV036", id.toString());
    }
}
