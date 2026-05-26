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
 * MobilePaymentV028Service — Business logic for MobilePaymentV028 operations.
 */
@ApplicationScoped
public class MobilePaymentV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV028Service.class);

    @Inject
    private MobilePaymentV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV028> findById(Long id) {
        LOG.debug("Finding MobilePaymentV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV028 create(MobilePaymentV028 entity) {
        LOG.info("Creating MobilePaymentV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV028 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV028 update(Long id, MobilePaymentV028 entity) {
        LOG.info("Updating MobilePaymentV028 id: {}", id);
        MobilePaymentV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV028 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV028", id.toString());
    }
}
