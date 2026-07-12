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
 * OnlineBankingSessionV017Service — Business logic for OnlineBankingSessionV017 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV017Service.class);

    @Inject
    private OnlineBankingSessionV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV017> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV017 create(OnlineBankingSessionV017 entity) {
        LOG.info("Creating OnlineBankingSessionV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV017 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV017 update(Long id, OnlineBankingSessionV017 entity) {
        LOG.info("Updating OnlineBankingSessionV017 id: {}", id);
        OnlineBankingSessionV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV017 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV017", id.toString());
    }
}
