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
 * OnlineBankingSessionV036Service — Business logic for OnlineBankingSessionV036 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV036Service.class);

    @Inject
    private OnlineBankingSessionV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV036> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV036 create(OnlineBankingSessionV036 entity) {
        LOG.info("Creating OnlineBankingSessionV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV036 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV036 update(Long id, OnlineBankingSessionV036 entity) {
        LOG.info("Updating OnlineBankingSessionV036 id: {}", id);
        OnlineBankingSessionV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV036 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV036", id.toString());
    }
}
