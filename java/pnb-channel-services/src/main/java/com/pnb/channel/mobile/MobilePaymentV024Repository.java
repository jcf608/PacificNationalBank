package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV024> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV024> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV024 e").getResultList();
    }

    @Transactional
    public MobilePaymentV024 save(MobilePaymentV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV024 entity = em.find(MobilePaymentV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
