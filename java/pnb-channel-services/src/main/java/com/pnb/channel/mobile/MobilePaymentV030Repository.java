package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV030> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV030> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV030 e").getResultList();
    }

    @Transactional
    public MobilePaymentV030 save(MobilePaymentV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV030 entity = em.find(MobilePaymentV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
