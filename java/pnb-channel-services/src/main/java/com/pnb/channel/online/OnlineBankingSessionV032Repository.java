package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV032> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV032> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV032 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV032 save(OnlineBankingSessionV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV032 entity = em.find(OnlineBankingSessionV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
