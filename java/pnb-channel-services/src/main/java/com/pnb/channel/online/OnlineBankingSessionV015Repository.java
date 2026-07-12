package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV015> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV015> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV015 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV015 save(OnlineBankingSessionV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV015 entity = em.find(OnlineBankingSessionV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
