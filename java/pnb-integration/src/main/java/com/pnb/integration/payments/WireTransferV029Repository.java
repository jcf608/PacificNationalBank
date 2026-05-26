package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV029> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV029> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV029 e").getResultList();
    }

    @Transactional
    public WireTransferV029 save(WireTransferV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV029 entity = em.find(WireTransferV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
