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
 * OnlineBankingSessionV033Service — Business logic for OnlineBankingSessionV033 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV033Service.class);

    @Inject
    private OnlineBankingSessionV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV033> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV033 create(OnlineBankingSessionV033 entity) {
        LOG.info("Creating OnlineBankingSessionV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV033 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV033 update(Long id, OnlineBankingSessionV033 entity) {
        LOG.info("Updating OnlineBankingSessionV033 id: {}", id);
        OnlineBankingSessionV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV033 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV033", id.toString());
    }
}
