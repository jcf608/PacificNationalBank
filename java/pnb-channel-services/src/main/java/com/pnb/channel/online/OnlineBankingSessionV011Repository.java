package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV011> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV011> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV011 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV011 save(OnlineBankingSessionV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV011 entity = em.find(OnlineBankingSessionV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
