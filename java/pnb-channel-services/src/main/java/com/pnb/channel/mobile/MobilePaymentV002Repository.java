package com.pnb.channel.mobile;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class MobilePaymentV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<MobilePaymentV002> findById(Long id) {
        return Optional.ofNullable(em.find(MobilePaymentV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<MobilePaymentV002> findAll() {
        return em.createQuery("SELECT e FROM MobilePaymentV002 e").getResultList();
    }

    @Transactional
    public MobilePaymentV002 save(MobilePaymentV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        MobilePaymentV002 entity = em.find(MobilePaymentV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
