package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV020> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV020> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV020 e").getResultList();
    }

    @Transactional
    public MobilePaymentV020 save(MobilePaymentV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV020 entity = em.find(MobilePaymentV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
