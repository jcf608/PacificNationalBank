package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV001> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV001> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV001 e").getResultList();
    }

    @Transactional
    public MobilePaymentV001 save(MobilePaymentV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV001 entity = em.find(MobilePaymentV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
