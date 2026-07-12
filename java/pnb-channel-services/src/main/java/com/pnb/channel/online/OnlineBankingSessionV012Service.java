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
 * OnlineBankingSessionV012Service — Business logic for OnlineBankingSessionV012 operations.
 */
@ApplicationScoped
public class OnlineBankingSessionV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(OnlineBankingSessionV012Service.class);

    @Inject
    private OnlineBankingSessionV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<OnlineBankingSessionV012> findById(Long id) {
        LOG.debug("Finding OnlineBankingSessionV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<OnlineBankingSessionV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public OnlineBankingSessionV012 create(OnlineBankingSessionV012 entity) {
        LOG.info("Creating OnlineBankingSessionV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV012 saved = repository.save(entity);
        auditService.log("CREATE", "OnlineBankingSessionV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public OnlineBankingSessionV012 update(Long id, OnlineBankingSessionV012 entity) {
        LOG.info("Updating OnlineBankingSessionV012 id: {}", id);
        OnlineBankingSessionV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("OnlineBankingSessionV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        OnlineBankingSessionV012 updated = repository.save(entity);
        auditService.log("UPDATE", "OnlineBankingSessionV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting OnlineBankingSessionV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "OnlineBankingSessionV012", id.toString());
    }
}
