package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV010> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV010> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV010 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV010 save(OnlineBankingSessionV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV010 entity = em.find(OnlineBankingSessionV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
