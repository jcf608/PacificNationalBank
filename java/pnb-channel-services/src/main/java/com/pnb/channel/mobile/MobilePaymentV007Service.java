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
 * MobilePaymentV007Service — Business logic for MobilePaymentV007 operations.
 */
@ApplicationScoped
public class MobilePaymentV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV007Service.class);

    @Inject
    private MobilePaymentV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV007> findById(Long id) {
        LOG.debug("Finding MobilePaymentV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV007 create(MobilePaymentV007 entity) {
        LOG.info("Creating MobilePaymentV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV007 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV007 update(Long id, MobilePaymentV007 entity) {
        LOG.info("Updating MobilePaymentV007 id: {}", id);
        MobilePaymentV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV007 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV007", id.toString());
    }
}
