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
 * CustomerV020Service — Business logic for CustomerV020 operations.
 */
@ApplicationScoped
public class CustomerV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV020Service.class);

    @Inject
    private CustomerV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV020> findById(Long id) {
        LOG.debug("Finding CustomerV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV020 create(CustomerV020 entity) {
        LOG.info("Creating CustomerV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV020 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV020 update(Long id, CustomerV020 entity) {
        LOG.info("Updating CustomerV020 id: {}", id);
        CustomerV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV020 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV020", id.toString());
    }
}
