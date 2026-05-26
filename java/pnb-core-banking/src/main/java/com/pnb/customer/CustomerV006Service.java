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
 * CustomerV006Service — Business logic for CustomerV006 operations.
 */
@ApplicationScoped
public class CustomerV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV006Service.class);

    @Inject
    private CustomerV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV006> findById(Long id) {
        LOG.debug("Finding CustomerV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV006 create(CustomerV006 entity) {
        LOG.info("Creating CustomerV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV006 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV006 update(Long id, CustomerV006 entity) {
        LOG.info("Updating CustomerV006 id: {}", id);
        CustomerV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV006 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV006", id.toString());
    }
}
