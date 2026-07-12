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
 * OnlineBankingSessionV025Service — Business logic for OnlineBankingSessionV025 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV025Service.class);

    @Inject
    private OnlineBankingSessionV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV025> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV025 create(OnlineBankingSessionV025 entity) {
        LOG.info("Creating OnlineBankingSessionV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV025 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV025 update(Long id, OnlineBankingSessionV025 entity) {
        LOG.info("Updating OnlineBankingSessionV025 id: {}", id);
        OnlineBankingSessionV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV025 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV025", id.toString());
    }
}
