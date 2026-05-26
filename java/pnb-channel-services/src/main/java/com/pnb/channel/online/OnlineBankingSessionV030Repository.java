package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV030> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV030> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV030 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV030 save(OnlineBankingSessionV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV030 entity = em.find(OnlineBankingSessionV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
