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
 * MobilePaymentV017Service — Business logic for MobilePaymentV017 operations.
 */
@ApplicationScoped
public class MobilePaymentV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV017Service.class);

    @Inject
    private MobilePaymentV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV017> findById(Long id) {
        LOG.debug("Finding MobilePaymentV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV017 create(MobilePaymentV017 entity) {
        LOG.info("Creating MobilePaymentV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV017 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV017 update(Long id, MobilePaymentV017 entity) {
        LOG.info("Updating MobilePaymentV017 id: {}", id);
        MobilePaymentV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV017 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV017", id.toString());
    }
}
