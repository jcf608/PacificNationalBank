package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV024> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV024> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV024 e").getResultList();
    }

    @Transactional
    public WireTransferV024 save(WireTransferV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV024 entity = em.find(WireTransferV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
