package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV020> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV020> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV020 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV020 save(OnlineBankingSessionV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV020 entity = em.find(OnlineBankingSessionV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
