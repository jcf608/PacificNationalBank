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
 * MobilePaymentV026Service — Business logic for MobilePaymentV026 operations.
 */
@ApplicationScoped
public class MobilePaymentV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV026Service.class);

    @Inject
    private MobilePaymentV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV026> findById(Long id) {
        LOG.debug("Finding MobilePaymentV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV026 create(MobilePaymentV026 entity) {
        LOG.info("Creating MobilePaymentV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV026 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV026 update(Long id, MobilePaymentV026 entity) {
        LOG.info("Updating MobilePaymentV026 id: {}", id);
        MobilePaymentV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV026 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV026", id.toString());
    }
}
