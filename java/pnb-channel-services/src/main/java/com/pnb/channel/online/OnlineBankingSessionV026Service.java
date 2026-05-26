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
 * OnlineBankingSessionV026Service — Business logic for OnlineBankingSessionV026 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV026Service.class);

    @Inject
    private OnlineBankingSessionV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV026> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV026 create(OnlineBankingSessionV026 entity) {
        LOG.info("Creating OnlineBankingSessionV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV026 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV026 update(Long id, OnlineBankingSessionV026 entity) {
        LOG.info("Updating OnlineBankingSessionV026 id: {}", id);
        OnlineBankingSessionV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV026 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV026", id.toString());
    }
}
