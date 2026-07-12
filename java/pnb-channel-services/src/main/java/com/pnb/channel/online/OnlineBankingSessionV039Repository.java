package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV039> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV039> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV039 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV039 save(OnlineBankingSessionV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV039 entity = em.find(OnlineBankingSessionV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
