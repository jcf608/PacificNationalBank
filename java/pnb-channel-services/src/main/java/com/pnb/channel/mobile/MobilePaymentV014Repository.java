package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV014> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV014> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV014 e").getResultList();
    }

    @Transactional
    public MobilePaymentV014 save(MobilePaymentV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV014 entity = em.find(MobilePaymentV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
