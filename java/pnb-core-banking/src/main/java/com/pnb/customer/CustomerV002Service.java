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
 * CustomerV002Service — Business logic for CustomerV002 operations.
 */
@ApplicationScoped
public class CustomerV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV002Service.class);

    @Inject
    private CustomerV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV002> findById(Long id) {
        LOG.debug("Finding CustomerV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV002 create(CustomerV002 entity) {
        LOG.info("Creating CustomerV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV002 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV002 update(Long id, CustomerV002 entity) {
        LOG.info("Updating CustomerV002 id: {}", id);
        CustomerV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV002 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV002", id.toString());
    }
}
