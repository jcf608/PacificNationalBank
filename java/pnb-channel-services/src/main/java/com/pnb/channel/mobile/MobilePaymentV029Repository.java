package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV029> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV029> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV029 e").getResultList();
    }

    @Transactional
    public MobilePaymentV029 save(MobilePaymentV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV029 entity = em.find(MobilePaymentV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
