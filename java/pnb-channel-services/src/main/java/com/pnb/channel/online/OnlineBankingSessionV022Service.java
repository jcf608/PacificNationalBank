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
 * OnlineBankingSessionV022Service — Business logic for OnlineBankingSessionV022 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV022Service.class);

    @Inject
    private OnlineBankingSessionV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV022> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV022 create(OnlineBankingSessionV022 entity) {
        LOG.info("Creating OnlineBankingSessionV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV022 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV022 update(Long id, OnlineBankingSessionV022 entity) {
        LOG.info("Updating OnlineBankingSessionV022 id: {}", id);
        OnlineBankingSessionV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV022 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV022", id.toString());
    }
}
