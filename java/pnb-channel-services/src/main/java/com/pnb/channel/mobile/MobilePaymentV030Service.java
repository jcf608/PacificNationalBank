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
 * MobilePaymentV030Service — Business logic for MobilePaymentV030 operations.
 */
@ApplicationScoped
public class MobilePaymentV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV030Service.class);

    @Inject
    private MobilePaymentV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV030> findById(Long id) {
        LOG.debug("Finding MobilePaymentV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV030 create(MobilePaymentV030 entity) {
        LOG.info("Creating MobilePaymentV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV030 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV030 update(Long id, MobilePaymentV030 entity) {
        LOG.info("Updating MobilePaymentV030 id: {}", id);
        MobilePaymentV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV030 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV030", id.toString());
    }
}
