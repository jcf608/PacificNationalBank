package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV007> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV007> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV007 e").getResultList();
    }

    @Transactional
    public WireTransferV007 save(WireTransferV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV007 entity = em.find(WireTransferV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
