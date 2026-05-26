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
 * MobilePaymentV013Service — Business logic for MobilePaymentV013 operations.
 */
@ApplicationScoped
public class MobilePaymentV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV013Service.class);

    @Inject
    private MobilePaymentV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV013> findById(Long id) {
        LOG.debug("Finding MobilePaymentV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV013 create(MobilePaymentV013 entity) {
        LOG.info("Creating MobilePaymentV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV013 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV013 update(Long id, MobilePaymentV013 entity) {
        LOG.info("Updating MobilePaymentV013 id: {}", id);
        MobilePaymentV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV013 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV013", id.toString());
    }
}
