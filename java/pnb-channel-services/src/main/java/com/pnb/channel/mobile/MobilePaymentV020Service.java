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
 * MobilePaymentV020Service — Business logic for MobilePaymentV020 operations.
 */
@ApplicationScoped
public class MobilePaymentV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV020Service.class);

    @Inject
    private MobilePaymentV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV020> findById(Long id) {
        LOG.debug("Finding MobilePaymentV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV020 create(MobilePaymentV020 entity) {
        LOG.info("Creating MobilePaymentV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV020 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV020 update(Long id, MobilePaymentV020 entity) {
        LOG.info("Updating MobilePaymentV020 id: {}", id);
        MobilePaymentV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV020 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV020", id.toString());
    }
}
