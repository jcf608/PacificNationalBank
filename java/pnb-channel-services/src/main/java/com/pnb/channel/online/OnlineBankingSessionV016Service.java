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
 * OnlineBankingSessionV016Service — Business logic for OnlineBankingSessionV016 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV016Service.class);

    @Inject
    private OnlineBankingSessionV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV016> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV016 create(OnlineBankingSessionV016 entity) {
        LOG.info("Creating OnlineBankingSessionV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV016 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV016 update(Long id, OnlineBankingSessionV016 entity) {
        LOG.info("Updating OnlineBankingSessionV016 id: {}", id);
        OnlineBankingSessionV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV016 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV016", id.toString());
    }
}
