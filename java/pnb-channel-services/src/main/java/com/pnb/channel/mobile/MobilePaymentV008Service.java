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
 * MobilePaymentV008Service — Business logic for MobilePaymentV008 operations.
 */
@ApplicationScoped
public class MobilePaymentV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV008Service.class);

    @Inject
    private MobilePaymentV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV008> findById(Long id) {
        LOG.debug("Finding MobilePaymentV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV008 create(MobilePaymentV008 entity) {
        LOG.info("Creating MobilePaymentV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV008 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV008 update(Long id, MobilePaymentV008 entity) {
        LOG.info("Updating MobilePaymentV008 id: {}", id);
        MobilePaymentV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV008 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV008", id.toString());
    }
}
