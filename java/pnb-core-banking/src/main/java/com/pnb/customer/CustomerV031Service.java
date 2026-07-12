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
 * CustomerV031Service — Business logic for CustomerV031 operations.
 */
@ApplicationScoped
public class CustomerV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV031Service.class);

    @Inject
    private CustomerV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV031> findById(Long id) {
        LOG.debug("Finding CustomerV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV031 create(CustomerV031 entity) {
        LOG.info("Creating CustomerV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV031 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV031 update(Long id, CustomerV031 entity) {
        LOG.info("Updating CustomerV031 id: {}", id);
        CustomerV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV031 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV031", id.toString());
    }
}
