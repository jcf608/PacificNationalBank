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
 * OnlineBankingSessionV008Service — Business logic for OnlineBankingSessionV008 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV008Service.class);

    @Inject
    private OnlineBankingSessionV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV008> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV008 create(OnlineBankingSessionV008 entity) {
        LOG.info("Creating OnlineBankingSessionV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV008 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV008 update(Long id, OnlineBankingSessionV008 entity) {
        LOG.info("Updating OnlineBankingSessionV008 id: {}", id);
        OnlineBankingSessionV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV008 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV008", id.toString());
    }
}
