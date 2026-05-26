package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV024> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV024> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV024 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV024 save(OnlineBankingSessionV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV024 entity = em.find(OnlineBankingSessionV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
