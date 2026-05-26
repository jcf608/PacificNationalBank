package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV019> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV019> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV019 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV019 save(OnlineBankingSessionV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV019 entity = em.find(OnlineBankingSessionV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
