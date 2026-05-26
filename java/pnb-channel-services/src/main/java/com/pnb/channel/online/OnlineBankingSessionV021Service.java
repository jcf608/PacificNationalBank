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
 * OnlineBankingSessionV021Service — Business logic for OnlineBankingSessionV021 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV021Service.class);

    @Inject
    private OnlineBankingSessionV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV021> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV021 create(OnlineBankingSessionV021 entity) {
        LOG.info("Creating OnlineBankingSessionV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV021 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV021 update(Long id, OnlineBankingSessionV021 entity) {
        LOG.info("Updating OnlineBankingSessionV021 id: {}", id);
        OnlineBankingSessionV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV021 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV021", id.toString());
    }
}
