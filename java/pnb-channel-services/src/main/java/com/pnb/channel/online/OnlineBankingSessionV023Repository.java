package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV023> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV023> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV023 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV023 save(OnlineBankingSessionV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV023 entity = em.find(OnlineBankingSessionV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
