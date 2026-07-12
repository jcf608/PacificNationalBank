package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV003> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV003> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV003 e").getResultList();
    }

    @Transactional
    public MobilePaymentV003 save(MobilePaymentV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV003 entity = em.find(MobilePaymentV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
