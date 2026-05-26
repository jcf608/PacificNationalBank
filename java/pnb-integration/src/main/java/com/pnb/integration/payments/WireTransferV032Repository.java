package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV032> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV032> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV032 e").getResultList();
    }

    @Transactional
    public WireTransferV032 save(WireTransferV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV032 entity = em.find(WireTransferV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
