package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV037> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV037> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV037 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV037 save(OnlineBankingSessionV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV037 entity = em.find(OnlineBankingSessionV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
