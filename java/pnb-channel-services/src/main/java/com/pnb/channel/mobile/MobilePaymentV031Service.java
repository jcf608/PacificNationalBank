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
 * MobilePaymentV031Service — Business logic for MobilePaymentV031 operations.
 */
@ApplicationScoped
public class MobilePaymentV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV031Service.class);

    @Inject
    private MobilePaymentV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV031> findById(Long id) {
        LOG.debug("Finding MobilePaymentV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV031 create(MobilePaymentV031 entity) {
        LOG.info("Creating MobilePaymentV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV031 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV031 update(Long id, MobilePaymentV031 entity) {
        LOG.info("Updating MobilePaymentV031 id: {}", id);
        MobilePaymentV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV031 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV031", id.toString());
    }
}
