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
 * CustomerV022Service — Business logic for CustomerV022 operations.
 */
@ApplicationScoped
public class CustomerV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV022Service.class);

    @Inject
    private CustomerV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV022> findById(Long id) {
        LOG.debug("Finding CustomerV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV022 create(CustomerV022 entity) {
        LOG.info("Creating CustomerV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV022 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV022 update(Long id, CustomerV022 entity) {
        LOG.info("Updating CustomerV022 id: {}", id);
        CustomerV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV022 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV022", id.toString());
    }
}
