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
 * OnlineBankingSessionV010Service — Business logic for OnlineBankingSessionV010 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV010Service.class);

    @Inject
    private OnlineBankingSessionV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV010> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV010 create(OnlineBankingSessionV010 entity) {
        LOG.info("Creating OnlineBankingSessionV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV010 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV010 update(Long id, OnlineBankingSessionV010 entity) {
        LOG.info("Updating OnlineBankingSessionV010 id: {}", id);
        OnlineBankingSessionV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV010 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV010", id.toString());
    }
}
