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
 * CustomerV021Service — Business logic for CustomerV021 operations.
 */
@ApplicationScoped
public class CustomerV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV021Service.class);

    @Inject
    private CustomerV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV021> findById(Long id) {
        LOG.debug("Finding CustomerV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV021 create(CustomerV021 entity) {
        LOG.info("Creating CustomerV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV021 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV021 update(Long id, CustomerV021 entity) {
        LOG.info("Updating CustomerV021 id: {}", id);
        CustomerV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV021 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV021", id.toString());
    }
}
