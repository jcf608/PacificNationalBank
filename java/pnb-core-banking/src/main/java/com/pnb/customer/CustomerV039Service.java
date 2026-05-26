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
 * CustomerV039Service — Business logic for CustomerV039 operations.
 */
@ApplicationScoped
public class CustomerV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV039Service.class);

    @Inject
    private CustomerV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV039> findById(Long id) {
        LOG.debug("Finding CustomerV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV039 create(CustomerV039 entity) {
        LOG.info("Creating CustomerV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV039 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV039 update(Long id, CustomerV039 entity) {
        LOG.info("Updating CustomerV039 id: {}", id);
        CustomerV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV039 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV039", id.toString());
    }
}
