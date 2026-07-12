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
 * OnlineBankingSessionV001Service — Business logic for OnlineBankingSessionV001 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV001Service.class);

    @Inject
    private OnlineBankingSessionV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV001> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV001 create(OnlineBankingSessionV001 entity) {
        LOG.info("Creating OnlineBankingSessionV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV001 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV001 update(Long id, OnlineBankingSessionV001 entity) {
        LOG.info("Updating OnlineBankingSessionV001 id: {}", id);
        OnlineBankingSessionV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV001 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV001", id.toString());
    }
}
