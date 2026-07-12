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
 * CustomerV032Service — Business logic for CustomerV032 operations.
 */
@ApplicationScoped
public class CustomerV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV032Service.class);

    @Inject
    private CustomerV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV032> findById(Long id) {
        LOG.debug("Finding CustomerV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV032 create(CustomerV032 entity) {
        LOG.info("Creating CustomerV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV032 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV032 update(Long id, CustomerV032 entity) {
        LOG.info("Updating CustomerV032 id: {}", id);
        CustomerV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV032 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV032", id.toString());
    }
}
