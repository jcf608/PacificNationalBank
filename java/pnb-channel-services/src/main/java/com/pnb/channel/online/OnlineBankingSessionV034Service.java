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
 * OnlineBankingSessionV034Service — Business logic for OnlineBankingSessionV034 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV034Service.class);

    @Inject
    private OnlineBankingSessionV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV034> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV034 create(OnlineBankingSessionV034 entity) {
        LOG.info("Creating OnlineBankingSessionV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV034 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV034 update(Long id, OnlineBankingSessionV034 entity) {
        LOG.info("Updating OnlineBankingSessionV034 id: {}", id);
        OnlineBankingSessionV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV034 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV034", id.toString());
    }
}
