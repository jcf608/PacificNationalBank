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
 * OnlineBankingSessionV005Service — Business logic for OnlineBankingSessionV005 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV005Service.class);

    @Inject
    private OnlineBankingSessionV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV005> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV005 create(OnlineBankingSessionV005 entity) {
        LOG.info("Creating OnlineBankingSessionV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV005 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV005 update(Long id, OnlineBankingSessionV005 entity) {
        LOG.info("Updating OnlineBankingSessionV005 id: {}", id);
        OnlineBankingSessionV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV005 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV005", id.toString());
    }
}
