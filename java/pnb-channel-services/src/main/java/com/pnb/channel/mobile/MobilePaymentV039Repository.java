package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV039> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV039> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV039 e").getResultList();
    }

    @Transactional
    public MobilePaymentV039 save(MobilePaymentV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV039 entity = em.find(MobilePaymentV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
