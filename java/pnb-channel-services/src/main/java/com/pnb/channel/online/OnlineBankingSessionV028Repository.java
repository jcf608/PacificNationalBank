package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV028> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV028> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV028 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV028 save(OnlineBankingSessionV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV028 entity = em.find(OnlineBankingSessionV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
