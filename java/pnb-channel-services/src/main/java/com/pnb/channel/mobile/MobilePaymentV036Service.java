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
 * MobilePaymentV036Service — Business logic for MobilePaymentV036 operations.
 */
@ApplicationScoped
public class MobilePaymentV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV036Service.class);

    @Inject
    private MobilePaymentV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV036> findById(Long id) {
        LOG.debug("Finding MobilePaymentV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV036 create(MobilePaymentV036 entity) {
        LOG.info("Creating MobilePaymentV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV036 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV036 update(Long id, MobilePaymentV036 entity) {
        LOG.info("Updating MobilePaymentV036 id: {}", id);
        MobilePaymentV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV036 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV036", id.toString());
    }
}
