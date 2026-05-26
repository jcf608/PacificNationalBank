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
 * MobilePaymentV027Service — Business logic for MobilePaymentV027 operations.
 */
@ApplicationScoped
public class MobilePaymentV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV027Service.class);

    @Inject
    private MobilePaymentV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV027> findById(Long id) {
        LOG.debug("Finding MobilePaymentV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV027 create(MobilePaymentV027 entity) {
        LOG.info("Creating MobilePaymentV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV027 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV027 update(Long id, MobilePaymentV027 entity) {
        LOG.info("Updating MobilePaymentV027 id: {}", id);
        MobilePaymentV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV027 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV027", id.toString());
    }
}
