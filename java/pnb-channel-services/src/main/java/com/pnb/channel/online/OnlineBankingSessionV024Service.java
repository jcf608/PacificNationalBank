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
 * OnlineBankingSessionV024Service — Business logic for OnlineBankingSessionV024 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV024Service.class);

    @Inject
    private OnlineBankingSessionV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV024> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV024 create(OnlineBankingSessionV024 entity) {
        LOG.info("Creating OnlineBankingSessionV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV024 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV024 update(Long id, OnlineBankingSessionV024 entity) {
        LOG.info("Updating OnlineBankingSessionV024 id: {}", id);
        OnlineBankingSessionV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV024 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV024", id.toString());
    }
}
