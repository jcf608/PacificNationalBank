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
 * MobilePaymentV034Service — Business logic for MobilePaymentV034 operations.
 */
@ApplicationScoped
public class MobilePaymentV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV034Service.class);

    @Inject
    private MobilePaymentV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV034> findById(Long id) {
        LOG.debug("Finding MobilePaymentV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV034 create(MobilePaymentV034 entity) {
        LOG.info("Creating MobilePaymentV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV034 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV034 update(Long id, MobilePaymentV034 entity) {
        LOG.info("Updating MobilePaymentV034 id: {}", id);
        MobilePaymentV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV034 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV034", id.toString());
    }
}
