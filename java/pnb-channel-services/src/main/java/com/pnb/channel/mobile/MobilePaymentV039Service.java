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
 * MobilePaymentV039Service — Business logic for MobilePaymentV039 operations.
 */
@ApplicationScoped
public class MobilePaymentV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV039Service.class);

    @Inject
    private MobilePaymentV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV039> findById(Long id) {
        LOG.debug("Finding MobilePaymentV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV039 create(MobilePaymentV039 entity) {
        LOG.info("Creating MobilePaymentV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV039 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV039 update(Long id, MobilePaymentV039 entity) {
        LOG.info("Updating MobilePaymentV039 id: {}", id);
        MobilePaymentV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV039 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV039", id.toString());
    }
}
