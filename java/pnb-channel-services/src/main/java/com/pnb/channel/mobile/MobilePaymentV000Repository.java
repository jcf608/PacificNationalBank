package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV000> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV000> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV000 e").getResultList();
    }

    @Transactional
    public MobilePaymentV000 save(MobilePaymentV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV000 entity = em.find(MobilePaymentV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
