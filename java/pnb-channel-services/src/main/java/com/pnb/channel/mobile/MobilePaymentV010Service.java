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
 * MobilePaymentV010Service — Business logic for MobilePaymentV010 operations.
 */
@ApplicationScoped
public class MobilePaymentV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV010Service.class);

    @Inject
    private MobilePaymentV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV010> findById(Long id) {
        LOG.debug("Finding MobilePaymentV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV010 create(MobilePaymentV010 entity) {
        LOG.info("Creating MobilePaymentV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV010 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV010 update(Long id, MobilePaymentV010 entity) {
        LOG.info("Updating MobilePaymentV010 id: {}", id);
        MobilePaymentV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV010 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV010", id.toString());
    }
}
