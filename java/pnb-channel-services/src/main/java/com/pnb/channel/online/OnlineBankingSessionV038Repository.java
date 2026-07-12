package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV038> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV038> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV038 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV038 save(OnlineBankingSessionV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV038 entity = em.find(OnlineBankingSessionV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
