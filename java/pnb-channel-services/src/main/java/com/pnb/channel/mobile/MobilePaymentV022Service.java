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
 * MobilePaymentV022Service — Business logic for MobilePaymentV022 operations.
 */
@ApplicationScoped
public class MobilePaymentV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV022Service.class);

    @Inject
    private MobilePaymentV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV022> findById(Long id) {
        LOG.debug("Finding MobilePaymentV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV022 create(MobilePaymentV022 entity) {
        LOG.info("Creating MobilePaymentV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV022 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV022 update(Long id, MobilePaymentV022 entity) {
        LOG.info("Updating MobilePaymentV022 id: {}", id);
        MobilePaymentV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV022 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV022", id.toString());
    }
}
