package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV013Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV013> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV013.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV013> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV013 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV013 save(OnlineBankingSessionV013 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV013 entity = em.find(OnlineBankingSessionV013.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
