package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV032> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV032> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV032 e").getResultList();
    }

    @Transactional
    public MobilePaymentV032 save(MobilePaymentV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV032 entity = em.find(MobilePaymentV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
