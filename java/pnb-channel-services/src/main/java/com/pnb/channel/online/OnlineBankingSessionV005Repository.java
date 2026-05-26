package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV005> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV005> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV005 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV005 save(OnlineBankingSessionV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV005 entity = em.find(OnlineBankingSessionV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
