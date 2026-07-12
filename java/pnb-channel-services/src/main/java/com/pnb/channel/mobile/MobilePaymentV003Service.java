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
 * MobilePaymentV003Service — Business logic for MobilePaymentV003 operations.
 */
@ApplicationScoped
public class MobilePaymentV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV003Service.class);

    @Inject
    private MobilePaymentV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV003> findById(Long id) {
        LOG.debug("Finding MobilePaymentV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV003 create(MobilePaymentV003 entity) {
        LOG.info("Creating MobilePaymentV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV003 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV003 update(Long id, MobilePaymentV003 entity) {
        LOG.info("Updating MobilePaymentV003 id: {}", id);
        MobilePaymentV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV003 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV003", id.toString());
    }
}
