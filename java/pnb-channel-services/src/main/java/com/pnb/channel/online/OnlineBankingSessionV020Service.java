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
 * OnlineBankingSessionV020Service — Business logic for OnlineBankingSessionV020 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV020Service.class);

    @Inject
    private OnlineBankingSessionV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV020> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV020 create(OnlineBankingSessionV020 entity) {
        LOG.info("Creating OnlineBankingSessionV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV020 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV020 update(Long id, OnlineBankingSessionV020 entity) {
        LOG.info("Updating OnlineBankingSessionV020 id: {}", id);
        OnlineBankingSessionV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV020 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV020", id.toString());
    }
}
