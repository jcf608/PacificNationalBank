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
 * MobilePaymentV000Service — Business logic for MobilePaymentV000 operations.
 */
@ApplicationScoped
public class MobilePaymentV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV000Service.class);

    @Inject
    private MobilePaymentV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV000> findById(Long id) {
        LOG.debug("Finding MobilePaymentV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV000 create(MobilePaymentV000 entity) {
        LOG.info("Creating MobilePaymentV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV000 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV000 update(Long id, MobilePaymentV000 entity) {
        LOG.info("Updating MobilePaymentV000 id: {}", id);
        MobilePaymentV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV000 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV000", id.toString());
    }
}
