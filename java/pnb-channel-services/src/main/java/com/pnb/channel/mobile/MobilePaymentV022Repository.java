package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV022> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV022> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV022 e").getResultList();
    }

    @Transactional
    public MobilePaymentV022 save(MobilePaymentV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV022 entity = em.find(MobilePaymentV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
