package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV034> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV034> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV034 e").getResultList();
    }

    @Transactional
    public MobilePaymentV034 save(MobilePaymentV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV034 entity = em.find(MobilePaymentV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
