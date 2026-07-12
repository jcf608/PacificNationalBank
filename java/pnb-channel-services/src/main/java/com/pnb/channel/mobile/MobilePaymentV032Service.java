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
 * MobilePaymentV032Service — Business logic for MobilePaymentV032 operations.
 */
@ApplicationScoped
public class MobilePaymentV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV032Service.class);

    @Inject
    private MobilePaymentV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV032> findById(Long id) {
        LOG.debug("Finding MobilePaymentV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV032 create(MobilePaymentV032 entity) {
        LOG.info("Creating MobilePaymentV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV032 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV032 update(Long id, MobilePaymentV032 entity) {
        LOG.info("Updating MobilePaymentV032 id: {}", id);
        MobilePaymentV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV032 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV032", id.toString());
    }
}
