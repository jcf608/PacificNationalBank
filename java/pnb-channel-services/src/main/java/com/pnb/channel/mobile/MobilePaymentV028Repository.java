package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV028> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV028> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV028 e").getResultList();
    }

    @Transactional
    public MobilePaymentV028 save(MobilePaymentV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV028 entity = em.find(MobilePaymentV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
