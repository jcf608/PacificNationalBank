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
 * MobilePaymentV019Service — Business logic for MobilePaymentV019 operations.
 */
@ApplicationScoped
public class MobilePaymentV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV019Service.class);

    @Inject
    private MobilePaymentV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV019> findById(Long id) {
        LOG.debug("Finding MobilePaymentV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV019 create(MobilePaymentV019 entity) {
        LOG.info("Creating MobilePaymentV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV019 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV019 update(Long id, MobilePaymentV019 entity) {
        LOG.info("Updating MobilePaymentV019 id: {}", id);
        MobilePaymentV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV019 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV019", id.toString());
    }
}
