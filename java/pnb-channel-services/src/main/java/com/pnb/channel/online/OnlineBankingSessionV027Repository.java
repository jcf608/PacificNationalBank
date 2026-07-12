package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV027> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV027> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV027 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV027 save(OnlineBankingSessionV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV027 entity = em.find(OnlineBankingSessionV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
