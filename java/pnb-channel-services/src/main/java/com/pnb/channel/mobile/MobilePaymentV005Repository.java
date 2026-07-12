package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV005> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV005> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV005 e").getResultList();
    }

    @Transactional
    public MobilePaymentV005 save(MobilePaymentV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV005 entity = em.find(MobilePaymentV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
