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
 * OnlineBankingSessionV007Service — Business logic for OnlineBankingSessionV007 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV007Service.class);

    @Inject
    private OnlineBankingSessionV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV007> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV007 create(OnlineBankingSessionV007 entity) {
        LOG.info("Creating OnlineBankingSessionV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV007 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV007 update(Long id, OnlineBankingSessionV007 entity) {
        LOG.info("Updating OnlineBankingSessionV007 id: {}", id);
        OnlineBankingSessionV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV007 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV007", id.toString());
    }
}
