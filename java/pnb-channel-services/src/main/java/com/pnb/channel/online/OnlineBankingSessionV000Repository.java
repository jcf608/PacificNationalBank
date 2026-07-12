package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV000> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV000> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV000 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV000 save(OnlineBankingSessionV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV000 entity = em.find(OnlineBankingSessionV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
