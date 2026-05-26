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
 * MobilePaymentV037Service — Business logic for MobilePaymentV037 operations.
 */
@ApplicationScoped
public class MobilePaymentV037Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV037Service.class);

    @Inject
    private MobilePaymentV037Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV037> findById(Long id) {
        LOG.debug("Finding MobilePaymentV037 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV037> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV037 create(MobilePaymentV037 entity) {
        LOG.info("Creating MobilePaymentV037");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV037 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV037", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV037 update(Long id, MobilePaymentV037 entity) {
        LOG.info("Updating MobilePaymentV037 id: {}", id);
        MobilePaymentV037 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV037 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV037 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV037", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV037 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV037", id.toString());
    }
}
