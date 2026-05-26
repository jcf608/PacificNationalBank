package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV010> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV010> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV010 e").getResultList();
    }

    @Transactional
    public MobilePaymentV010 save(MobilePaymentV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV010 entity = em.find(MobilePaymentV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
