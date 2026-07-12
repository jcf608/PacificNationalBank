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
 * MobilePaymentV029Service — Business logic for MobilePaymentV029 operations.
 */
@ApplicationScoped
public class MobilePaymentV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV029Service.class);

    @Inject
    private MobilePaymentV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV029> findById(Long id) {
        LOG.debug("Finding MobilePaymentV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV029 create(MobilePaymentV029 entity) {
        LOG.info("Creating MobilePaymentV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV029 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV029 update(Long id, MobilePaymentV029 entity) {
        LOG.info("Updating MobilePaymentV029 id: {}", id);
        MobilePaymentV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV029 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV029", id.toString());
    }
}
