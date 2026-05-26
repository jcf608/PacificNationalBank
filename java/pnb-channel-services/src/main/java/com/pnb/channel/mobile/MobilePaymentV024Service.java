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
 * MobilePaymentV024Service — Business logic for MobilePaymentV024 operations.
 */
@ApplicationScoped
public class MobilePaymentV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV024Service.class);

    @Inject
    private MobilePaymentV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV024> findById(Long id) {
        LOG.debug("Finding MobilePaymentV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV024 create(MobilePaymentV024 entity) {
        LOG.info("Creating MobilePaymentV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV024 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV024 update(Long id, MobilePaymentV024 entity) {
        LOG.info("Updating MobilePaymentV024 id: {}", id);
        MobilePaymentV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV024 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV024", id.toString());
    }
}
