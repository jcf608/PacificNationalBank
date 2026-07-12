package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV025> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV025> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV025 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV025 save(OnlineBankingSessionV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV025 entity = em.find(OnlineBankingSessionV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
