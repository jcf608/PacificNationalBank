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
 * OnlineBankingSessionV002Service — Business logic for OnlineBankingSessionV002 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV002Service.class);

    @Inject
    private OnlineBankingSessionV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV002> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV002 create(OnlineBankingSessionV002 entity) {
        LOG.info("Creating OnlineBankingSessionV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV002 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV002 update(Long id, OnlineBankingSessionV002 entity) {
        LOG.info("Updating OnlineBankingSessionV002 id: {}", id);
        OnlineBankingSessionV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV002 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV002", id.toString());
    }
}
