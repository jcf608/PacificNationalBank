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
 * OnlineBankingSessionV032Service — Business logic for OnlineBankingSessionV032 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV032Service.class);

    @Inject
    private OnlineBankingSessionV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV032> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV032 create(OnlineBankingSessionV032 entity) {
        LOG.info("Creating OnlineBankingSessionV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV032 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV032 update(Long id, OnlineBankingSessionV032 entity) {
        LOG.info("Updating OnlineBankingSessionV032 id: {}", id);
        OnlineBankingSessionV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV032 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV032", id.toString());
    }
}
