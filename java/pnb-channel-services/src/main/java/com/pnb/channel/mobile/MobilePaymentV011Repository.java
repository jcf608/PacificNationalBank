package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV011> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV011> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV011 e").getResultList();
    }

    @Transactional
    public MobilePaymentV011 save(MobilePaymentV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV011 entity = em.find(MobilePaymentV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
