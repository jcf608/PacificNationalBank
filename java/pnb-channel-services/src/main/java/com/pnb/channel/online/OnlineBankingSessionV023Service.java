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
 * OnlineBankingSessionV023Service — Business logic for OnlineBankingSessionV023 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV023Service.class);

    @Inject
    private OnlineBankingSessionV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV023> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV023 create(OnlineBankingSessionV023 entity) {
        LOG.info("Creating OnlineBankingSessionV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV023 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV023 update(Long id, OnlineBankingSessionV023 entity) {
        LOG.info("Updating OnlineBankingSessionV023 id: {}", id);
        OnlineBankingSessionV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV023 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV023", id.toString());
    }
}
