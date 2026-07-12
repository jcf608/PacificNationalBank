package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV018> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV018> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV018 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV018 save(OnlineBankingSessionV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV018 entity = em.find(OnlineBankingSessionV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
