package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV036> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV036> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV036 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV036 save(OnlineBankingSessionV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV036 entity = em.find(OnlineBankingSessionV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
