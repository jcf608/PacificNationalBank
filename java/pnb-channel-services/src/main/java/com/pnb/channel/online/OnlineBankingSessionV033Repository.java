package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV033> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV033> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV033 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV033 save(OnlineBankingSessionV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV033 entity = em.find(OnlineBankingSessionV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
