package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV026> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV026> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV026 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV026 save(OnlineBankingSessionV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV026 entity = em.find(OnlineBankingSessionV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
