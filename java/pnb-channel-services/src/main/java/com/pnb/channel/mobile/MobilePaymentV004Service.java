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
 * MobilePaymentV004Service — Business logic for MobilePaymentV004 operations.
 */
@ApplicationScoped
public class MobilePaymentV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV004Service.class);

    @Inject
    private MobilePaymentV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV004> findById(Long id) {
        LOG.debug("Finding MobilePaymentV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV004 create(MobilePaymentV004 entity) {
        LOG.info("Creating MobilePaymentV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV004 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV004 update(Long id, MobilePaymentV004 entity) {
        LOG.info("Updating MobilePaymentV004 id: {}", id);
        MobilePaymentV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV004 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV004", id.toString());
    }
}
