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
 * CustomerV011Service — Business logic for CustomerV011 operations.
 */
@ApplicationScoped
public class CustomerV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV011Service.class);

    @Inject
    private CustomerV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV011> findById(Long id) {
        LOG.debug("Finding CustomerV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV011 create(CustomerV011 entity) {
        LOG.info("Creating CustomerV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV011 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV011 update(Long id, CustomerV011 entity) {
        LOG.info("Updating CustomerV011 id: {}", id);
        CustomerV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV011 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV011", id.toString());
    }
}
