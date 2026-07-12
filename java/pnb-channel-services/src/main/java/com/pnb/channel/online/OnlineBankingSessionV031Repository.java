package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV031> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV031> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV031 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV031 save(OnlineBankingSessionV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV031 entity = em.find(OnlineBankingSessionV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
