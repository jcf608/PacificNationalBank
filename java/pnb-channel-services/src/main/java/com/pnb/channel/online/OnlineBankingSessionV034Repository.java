package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV034> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV034> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV034 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV034 save(OnlineBankingSessionV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV034 entity = em.find(OnlineBankingSessionV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
