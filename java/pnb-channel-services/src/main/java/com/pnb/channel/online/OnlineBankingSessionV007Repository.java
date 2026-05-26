package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV007> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV007> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV007 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV007 save(OnlineBankingSessionV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV007 entity = em.find(OnlineBankingSessionV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
