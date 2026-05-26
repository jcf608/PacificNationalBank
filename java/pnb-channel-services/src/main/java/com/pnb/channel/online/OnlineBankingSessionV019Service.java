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
 * OnlineBankingSessionV019Service — Business logic for OnlineBankingSessionV019 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV019Service.class);

    @Inject
    private OnlineBankingSessionV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV019> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV019 create(OnlineBankingSessionV019 entity) {
        LOG.info("Creating OnlineBankingSessionV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV019 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV019 update(Long id, OnlineBankingSessionV019 entity) {
        LOG.info("Updating OnlineBankingSessionV019 id: {}", id);
        OnlineBankingSessionV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV019 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV019", id.toString());
    }
}
