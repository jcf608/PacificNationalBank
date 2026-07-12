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
 * OnlineBankingSessionV029Service — Business logic for OnlineBankingSessionV029 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV029Service.class);

    @Inject
    private OnlineBankingSessionV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV029> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV029 create(OnlineBankingSessionV029 entity) {
        LOG.info("Creating OnlineBankingSessionV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV029 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV029 update(Long id, OnlineBankingSessionV029 entity) {
        LOG.info("Updating OnlineBankingSessionV029 id: {}", id);
        OnlineBankingSessionV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV029 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV029", id.toString());
    }
}
