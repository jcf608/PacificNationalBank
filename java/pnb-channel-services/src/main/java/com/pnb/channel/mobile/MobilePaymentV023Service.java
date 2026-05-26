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
 * MobilePaymentV023Service — Business logic for MobilePaymentV023 operations.
 */
@ApplicationScoped
public class MobilePaymentV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV023Service.class);

    @Inject
    private MobilePaymentV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV023> findById(Long id) {
        LOG.debug("Finding MobilePaymentV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV023 create(MobilePaymentV023 entity) {
        LOG.info("Creating MobilePaymentV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV023 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV023 update(Long id, MobilePaymentV023 entity) {
        LOG.info("Updating MobilePaymentV023 id: {}", id);
        MobilePaymentV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV023 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV023", id.toString());
    }
}
