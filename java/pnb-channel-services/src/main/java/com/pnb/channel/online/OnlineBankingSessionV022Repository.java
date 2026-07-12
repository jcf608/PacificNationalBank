package com.pnb.channel.online;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class OnlineBankingSessionV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<OnlineBankingSessionV022> findById(Long id) {
        return Optional.ofNullable(em.find(OnlineBankingSessionV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<OnlineBankingSessionV022> findAll() {
        return em.createQuery("SELECT e FROM OnlineBankingSessionV022 e").getResultList();
    }

    @Transactional
    public OnlineBankingSessionV022 save(OnlineBankingSessionV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        OnlineBankingSessionV022 entity = em.find(OnlineBankingSessionV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
