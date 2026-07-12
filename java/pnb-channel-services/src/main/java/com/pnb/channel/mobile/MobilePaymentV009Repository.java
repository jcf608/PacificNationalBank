package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV009> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV009> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV009 e").getResultList();
    }

    @Transactional
    public MobilePaymentV009 save(MobilePaymentV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV009 entity = em.find(MobilePaymentV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
