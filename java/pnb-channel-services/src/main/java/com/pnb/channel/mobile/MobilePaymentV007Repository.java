package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV007> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV007> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV007 e").getResultList();
    }

    @Transactional
    public MobilePaymentV007 save(MobilePaymentV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV007 entity = em.find(MobilePaymentV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
