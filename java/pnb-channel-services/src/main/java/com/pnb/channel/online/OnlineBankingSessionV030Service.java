package com.pnb.channel.online;

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
 * OnlineBankingSessionV030Service — Business logic for OnlineBankingSessionV030 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV030Service.class);

    @Inject
    private OnlineBankingSessionV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV030> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV030 create(OnlineBankingSessionV030 entity) {
        LOG.info("Creating OnlineBankingSessionV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV030 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV030 update(Long id, OnlineBankingSessionV030 entity) {
        LOG.info("Updating OnlineBankingSessionV030 id: {}", id);
        OnlineBankingSessionV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV030 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV030", id.toString());
    }
}
