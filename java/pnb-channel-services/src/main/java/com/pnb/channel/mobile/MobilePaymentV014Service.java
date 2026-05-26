package com.pnb.channel.mobile;

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
 * MobilePaymentV014Service — Business logic for MobilePaymentV014 operations.
 */
@ApplicationScoped
public class MobilePaymentV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV014Service.class);

    @Inject
    private MobilePaymentV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV014> findById(Long id) {
        LOG.debug("Finding MobilePaymentV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV014 create(MobilePaymentV014 entity) {
        LOG.info("Creating MobilePaymentV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV014 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV014 update(Long id, MobilePaymentV014 entity) {
        LOG.info("Updating MobilePaymentV014 id: {}", id);
        MobilePaymentV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV014 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV014", id.toString());
    }
}
