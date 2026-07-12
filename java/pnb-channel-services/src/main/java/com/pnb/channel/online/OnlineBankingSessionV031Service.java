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
 * OnlineBankingSessionV031Service — Business logic for OnlineBankingSessionV031 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV031Service.class);

    @Inject
    private OnlineBankingSessionV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV031> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV031 create(OnlineBankingSessionV031 entity) {
        LOG.info("Creating OnlineBankingSessionV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV031 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV031 update(Long id, OnlineBankingSessionV031 entity) {
        LOG.info("Updating OnlineBankingSessionV031 id: {}", id);
        OnlineBankingSessionV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV031 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV031", id.toString());
    }
}
