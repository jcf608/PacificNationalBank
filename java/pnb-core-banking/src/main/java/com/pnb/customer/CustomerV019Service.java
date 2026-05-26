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
 * CustomerV019Service — Business logic for CustomerV019 operations.
 */
@ApplicationScoped
public class CustomerV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV019Service.class);

    @Inject
    private CustomerV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV019> findById(Long id) {
        LOG.debug("Finding CustomerV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV019 create(CustomerV019 entity) {
        LOG.info("Creating CustomerV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV019 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV019 update(Long id, CustomerV019 entity) {
        LOG.info("Updating CustomerV019 id: {}", id);
        CustomerV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV019 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV019", id.toString());
    }
}
