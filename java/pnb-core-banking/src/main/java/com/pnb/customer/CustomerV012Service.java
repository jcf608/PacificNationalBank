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
 * CustomerV012Service — Business logic for CustomerV012 operations.
 */
@ApplicationScoped
public class CustomerV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerV012Service.class);

    @Inject
    private CustomerV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<CustomerV012> findById(Long id) {
        LOG.debug("Finding CustomerV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<CustomerV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public CustomerV012 create(CustomerV012 entity) {
        LOG.info("Creating CustomerV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV012 saved = repository.save(entity);
        auditService.log("CREATE", "CustomerV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public CustomerV012 update(Long id, CustomerV012 entity) {
        LOG.info("Updating CustomerV012 id: {}", id);
        CustomerV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("CustomerV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        CustomerV012 updated = repository.save(entity);
        auditService.log("UPDATE", "CustomerV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting CustomerV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "CustomerV012", id.toString());
    }
}
