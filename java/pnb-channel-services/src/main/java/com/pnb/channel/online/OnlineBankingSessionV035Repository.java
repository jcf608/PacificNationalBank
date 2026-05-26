package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV035Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV035> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV035.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV035> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV035 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV035 save(OnlineBankingSessionV035 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV035 entity = em.find(OnlineBankingSessionV035.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
