package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV002> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV002> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV002 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV002 save(OnlineBankingSessionV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV002 entity = em.find(OnlineBankingSessionV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
