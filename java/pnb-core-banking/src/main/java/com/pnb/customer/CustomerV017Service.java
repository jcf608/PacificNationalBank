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
 * CustomerV017Service — Business logic for CustomerV017 operations.
 */
@ApplicationScoped
public class CustomerV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV017Service.class);

    @Inject
    private CustomerV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV017> findById(Long id) {
        LOG.debug("Finding CustomerV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV017 create(CustomerV017 entity) {
        LOG.info("Creating CustomerV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV017 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV017 update(Long id, CustomerV017 entity) {
        LOG.info("Updating CustomerV017 id: {}", id);
        CustomerV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV017 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV017", id.toString());
    }
}
