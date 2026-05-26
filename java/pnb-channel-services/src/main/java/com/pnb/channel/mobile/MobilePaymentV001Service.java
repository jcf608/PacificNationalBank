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
 * MobilePaymentV001Service — Business logic for MobilePaymentV001 operations.
 */
@ApplicationScoped
public class MobilePaymentV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV001Service.class);

    @Inject
    private MobilePaymentV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV001> findById(Long id) {
        LOG.debug("Finding MobilePaymentV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV001 create(MobilePaymentV001 entity) {
        LOG.info("Creating MobilePaymentV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV001 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV001 update(Long id, MobilePaymentV001 entity) {
        LOG.info("Updating MobilePaymentV001 id: {}", id);
        MobilePaymentV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV001 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV001", id.toString());
    }
}
