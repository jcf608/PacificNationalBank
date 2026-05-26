package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV029> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV029> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV029 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV029 save(OnlineBankingSessionV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV029 entity = em.find(OnlineBankingSessionV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
