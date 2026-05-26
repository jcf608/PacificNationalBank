package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV049Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV049> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV049.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV049> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV049 e").getResultList();
    }

    @Transactional
    public WireTransferV049 save(WireTransferV049 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV049 entity = em.find(WireTransferV049.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
