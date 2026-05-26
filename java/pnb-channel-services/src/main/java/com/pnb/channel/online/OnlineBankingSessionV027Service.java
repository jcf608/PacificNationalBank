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
 * OnlineBankingSessionV027Service — Business logic for OnlineBankingSessionV027 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV027Service.class);

    @Inject
    private OnlineBankingSessionV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV027> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV027 create(OnlineBankingSessionV027 entity) {
        LOG.info("Creating OnlineBankingSessionV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV027 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV027 update(Long id, OnlineBankingSessionV027 entity) {
        LOG.info("Updating OnlineBankingSessionV027 id: {}", id);
        OnlineBankingSessionV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV027 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV027", id.toString());
    }
}
