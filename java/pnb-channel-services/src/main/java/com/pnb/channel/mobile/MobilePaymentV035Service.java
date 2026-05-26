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
 * MobilePaymentV035Service — Business logic for MobilePaymentV035 operations.
 */
@ApplicationScoped
public class MobilePaymentV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV035Service.class);

    @Inject
    private MobilePaymentV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV035> findById(Long id) {
        LOG.debug("Finding MobilePaymentV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV035 create(MobilePaymentV035 entity) {
        LOG.info("Creating MobilePaymentV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV035 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV035 update(Long id, MobilePaymentV035 entity) {
        LOG.info("Updating MobilePaymentV035 id: {}", id);
        MobilePaymentV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV035 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV035", id.toString());
    }
}
