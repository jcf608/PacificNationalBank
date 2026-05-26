package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV019> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV019> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV019 e").getResultList();
    }

    @Transactional
    public MobilePaymentV019 save(MobilePaymentV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV019 entity = em.find(MobilePaymentV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
