package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV017> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV017> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV017 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV017 save(OnlineBankingSessionV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV017 entity = em.find(OnlineBankingSessionV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
