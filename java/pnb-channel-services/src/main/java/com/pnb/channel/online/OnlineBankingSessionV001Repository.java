package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV001> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV001> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV001 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV001 save(OnlineBankingSessionV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV001 entity = em.find(OnlineBankingSessionV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
