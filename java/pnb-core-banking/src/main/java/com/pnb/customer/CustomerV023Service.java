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
 * CustomerV023Service — Business logic for CustomerV023 operations.
 */
@ApplicationScoped
public class CustomerV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV023Service.class);

    @Inject
    private CustomerV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV023> findById(Long id) {
        LOG.debug("Finding CustomerV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV023 create(CustomerV023 entity) {
        LOG.info("Creating CustomerV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV023 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV023 update(Long id, CustomerV023 entity) {
        LOG.info("Updating CustomerV023 id: {}", id);
        CustomerV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV023 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV023", id.toString());
    }
}
