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
 * MobilePaymentV038Service — Business logic for MobilePaymentV038 operations.
 */
@ApplicationScoped
public class MobilePaymentV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV038Service.class);

    @Inject
    private MobilePaymentV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV038> findById(Long id) {
        LOG.debug("Finding MobilePaymentV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV038 create(MobilePaymentV038 entity) {
        LOG.info("Creating MobilePaymentV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV038 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV038 update(Long id, MobilePaymentV038 entity) {
        LOG.info("Updating MobilePaymentV038 id: {}", id);
        MobilePaymentV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV038 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV038", id.toString());
    }
}
