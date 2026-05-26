package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV005> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV005> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV005 e").getResultList();
    }

    @Transactional
    public WireTransferV005 save(WireTransferV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV005 entity = em.find(WireTransferV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
