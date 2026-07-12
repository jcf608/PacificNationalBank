package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV006Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV006> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV006.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV006> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV006 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV006 save(OnlineBankingSessionV006 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV006 entity = em.find(OnlineBankingSessionV006.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
