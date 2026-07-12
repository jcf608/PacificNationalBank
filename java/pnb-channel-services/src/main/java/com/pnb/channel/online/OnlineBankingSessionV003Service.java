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
 * OnlineBankingSessionV003Service — Business logic for OnlineBankingSessionV003 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV003Service.class);

    @Inject
    private OnlineBankingSessionV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV003> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV003 create(OnlineBankingSessionV003 entity) {
        LOG.info("Creating OnlineBankingSessionV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV003 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV003 update(Long id, OnlineBankingSessionV003 entity) {
        LOG.info("Updating OnlineBankingSessionV003 id: {}", id);
        OnlineBankingSessionV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV003 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV003", id.toString());
    }
}
