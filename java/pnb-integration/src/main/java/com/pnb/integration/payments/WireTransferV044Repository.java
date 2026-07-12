package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV044Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV044> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV044.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV044> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV044 e").getResultList();
    }

    @Transactional
    public WireTransferV044 save(WireTransferV044 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV044 entity = em.find(WireTransferV044.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
