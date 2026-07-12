package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV025> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV025> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV025 e").getResultList();
    }

    @Transactional
    public MobilePaymentV025 save(MobilePaymentV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV025 entity = em.find(MobilePaymentV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
