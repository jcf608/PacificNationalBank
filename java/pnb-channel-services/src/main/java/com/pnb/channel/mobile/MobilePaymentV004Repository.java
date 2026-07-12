package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV004> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV004> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV004 e").getResultList();
    }

    @Transactional
    public MobilePaymentV004 save(MobilePaymentV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV004 entity = em.find(MobilePaymentV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
