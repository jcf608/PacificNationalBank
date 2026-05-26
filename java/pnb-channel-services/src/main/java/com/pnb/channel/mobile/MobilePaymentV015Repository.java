package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV015> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV015> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV015 e").getResultList();
    }

    @Transactional
    public MobilePaymentV015 save(MobilePaymentV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV015 entity = em.find(MobilePaymentV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
