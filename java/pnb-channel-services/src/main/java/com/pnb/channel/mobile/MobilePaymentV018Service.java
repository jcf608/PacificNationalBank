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
 * MobilePaymentV018Service — Business logic for MobilePaymentV018 operations.
 */
@ApplicationScoped
public class MobilePaymentV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV018Service.class);

    @Inject
    private MobilePaymentV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV018> findById(Long id) {
        LOG.debug("Finding MobilePaymentV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV018 create(MobilePaymentV018 entity) {
        LOG.info("Creating MobilePaymentV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV018 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV018 update(Long id, MobilePaymentV018 entity) {
        LOG.info("Updating MobilePaymentV018 id: {}", id);
        MobilePaymentV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV018 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV018", id.toString());
    }
}
