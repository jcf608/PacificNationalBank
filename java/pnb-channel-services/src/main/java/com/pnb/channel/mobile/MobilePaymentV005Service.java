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
 * MobilePaymentV005Service — Business logic for MobilePaymentV005 operations.
 */
@ApplicationScoped
public class MobilePaymentV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV005Service.class);

    @Inject
    private MobilePaymentV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV005> findById(Long id) {
        LOG.debug("Finding MobilePaymentV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV005 create(MobilePaymentV005 entity) {
        LOG.info("Creating MobilePaymentV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV005 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV005 update(Long id, MobilePaymentV005 entity) {
        LOG.info("Updating MobilePaymentV005 id: {}", id);
        MobilePaymentV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV005 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV005", id.toString());
    }
}
