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
 * OnlineBankingSessionV028Service — Business logic for OnlineBankingSessionV028 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV028Service.class);

    @Inject
    private OnlineBankingSessionV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV028> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV028 create(OnlineBankingSessionV028 entity) {
        LOG.info("Creating OnlineBankingSessionV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV028 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV028 update(Long id, OnlineBankingSessionV028 entity) {
        LOG.info("Updating OnlineBankingSessionV028 id: {}", id);
        OnlineBankingSessionV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV028 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV028", id.toString());
    }
}
