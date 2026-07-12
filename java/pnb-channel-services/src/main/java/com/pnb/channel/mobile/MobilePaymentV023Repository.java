package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV023> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV023> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV023 e").getResultList();
    }

    @Transactional
    public MobilePaymentV023 save(MobilePaymentV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV023 entity = em.find(MobilePaymentV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
