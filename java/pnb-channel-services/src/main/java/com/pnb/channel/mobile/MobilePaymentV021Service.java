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
 * MobilePaymentV021Service — Business logic for MobilePaymentV021 operations.
 */
@ApplicationScoped
public class MobilePaymentV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV021Service.class);

    @Inject
    private MobilePaymentV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV021> findById(Long id) {
        LOG.debug("Finding MobilePaymentV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV021 create(MobilePaymentV021 entity) {
        LOG.info("Creating MobilePaymentV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV021 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV021 update(Long id, MobilePaymentV021 entity) {
        LOG.info("Updating MobilePaymentV021 id: {}", id);
        MobilePaymentV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV021 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV021", id.toString());
    }
}
