package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV008> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV008> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV008 e").getResultList();
    }

    @Transactional
    public MobilePaymentV008 save(MobilePaymentV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV008 entity = em.find(MobilePaymentV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
