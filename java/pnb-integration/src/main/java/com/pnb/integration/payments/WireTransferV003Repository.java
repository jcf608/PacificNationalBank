package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV003> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV003> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV003 e").getResultList();
    }

    @Transactional
    public WireTransferV003 save(WireTransferV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV003 entity = em.find(WireTransferV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
