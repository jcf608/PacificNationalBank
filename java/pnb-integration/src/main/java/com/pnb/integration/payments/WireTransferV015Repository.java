package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV015> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV015> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV015 e").getResultList();
    }

    @Transactional
    public WireTransferV015 save(WireTransferV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV015 entity = em.find(WireTransferV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
