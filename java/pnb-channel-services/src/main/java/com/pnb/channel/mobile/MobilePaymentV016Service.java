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
 * MobilePaymentV016Service — Business logic for MobilePaymentV016 operations.
 */
@ApplicationScoped
public class MobilePaymentV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV016Service.class);

    @Inject
    private MobilePaymentV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV016> findById(Long id) {
        LOG.debug("Finding MobilePaymentV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV016 create(MobilePaymentV016 entity) {
        LOG.info("Creating MobilePaymentV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV016 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV016 update(Long id, MobilePaymentV016 entity) {
        LOG.info("Updating MobilePaymentV016 id: {}", id);
        MobilePaymentV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV016 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV016", id.toString());
    }
}
