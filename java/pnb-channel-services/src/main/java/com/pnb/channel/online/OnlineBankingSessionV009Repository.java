package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV009> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV009> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV009 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV009 save(OnlineBankingSessionV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV009 entity = em.find(OnlineBankingSessionV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
