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
 * MobilePaymentV002Service — Business logic for MobilePaymentV002 operations.
 */
@ApplicationScoped
public class MobilePaymentV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV002Service.class);

    @Inject
    private MobilePaymentV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV002> findById(Long id) {
        LOG.debug("Finding MobilePaymentV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV002 create(MobilePaymentV002 entity) {
        LOG.info("Creating MobilePaymentV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV002 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV002 update(Long id, MobilePaymentV002 entity) {
        LOG.info("Updating MobilePaymentV002 id: {}", id);
        MobilePaymentV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV002 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV002", id.toString());
    }
}
