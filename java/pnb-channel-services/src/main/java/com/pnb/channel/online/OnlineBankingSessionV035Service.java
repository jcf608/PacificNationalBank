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
 * OnlineBankingSessionV035Service — Business logic for OnlineBankingSessionV035 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV035Service.class);

    @Inject
    private OnlineBankingSessionV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV035> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV035 create(OnlineBankingSessionV035 entity) {
        LOG.info("Creating OnlineBankingSessionV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV035 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV035 update(Long id, OnlineBankingSessionV035 entity) {
        LOG.info("Updating OnlineBankingSessionV035 id: {}", id);
        OnlineBankingSessionV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV035 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV035", id.toString());
    }
}
