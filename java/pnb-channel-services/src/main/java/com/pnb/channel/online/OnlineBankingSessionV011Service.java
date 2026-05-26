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
 * OnlineBankingSessionV011Service — Business logic for OnlineBankingSessionV011 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV011Service.class);

    @Inject
    private OnlineBankingSessionV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV011> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV011 create(OnlineBankingSessionV011 entity) {
        LOG.info("Creating OnlineBankingSessionV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV011 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV011 update(Long id, OnlineBankingSessionV011 entity) {
        LOG.info("Updating OnlineBankingSessionV011 id: {}", id);
        OnlineBankingSessionV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV011 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV011", id.toString());
    }
}
