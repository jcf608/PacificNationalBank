package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV017> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV017> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV017 e").getResultList();
    }

    @Transactional
    public MobilePaymentV017 save(MobilePaymentV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV017 entity = em.find(MobilePaymentV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
