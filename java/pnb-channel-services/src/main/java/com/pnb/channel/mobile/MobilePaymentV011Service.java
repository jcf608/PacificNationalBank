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
 * MobilePaymentV011Service — Business logic for MobilePaymentV011 operations.
 */
@ApplicationScoped
public class MobilePaymentV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(MobilePaymentV011Service.class);

    @Inject
    private MobilePaymentV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<MobilePaymentV011> findById(Long id) {
        LOG.debug("Finding MobilePaymentV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<MobilePaymentV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public MobilePaymentV011 create(MobilePaymentV011 entity) {
        LOG.info("Creating MobilePaymentV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV011 saved = repository.save(entity);
        auditService.log("CREATE", "MobilePaymentV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public MobilePaymentV011 update(Long id, MobilePaymentV011 entity) {
        LOG.info("Updating MobilePaymentV011 id: {}", id);
        MobilePaymentV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("MobilePaymentV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        MobilePaymentV011 updated = repository.save(entity);
        auditService.log("UPDATE", "MobilePaymentV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting MobilePaymentV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "MobilePaymentV011", id.toString());
    }
}
