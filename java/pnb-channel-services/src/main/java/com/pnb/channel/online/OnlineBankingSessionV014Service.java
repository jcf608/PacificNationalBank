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
 * OnlineBankingSessionV014Service — Business logic for OnlineBankingSessionV014 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV014Service.class);

    @Inject
    private OnlineBankingSessionV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV014> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV014 create(OnlineBankingSessionV014 entity) {
        LOG.info("Creating OnlineBankingSessionV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV014 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV014 update(Long id, OnlineBankingSessionV014 entity) {
        LOG.info("Updating OnlineBankingSessionV014 id: {}", id);
        OnlineBankingSessionV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV014 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV014", id.toString());
    }
}
