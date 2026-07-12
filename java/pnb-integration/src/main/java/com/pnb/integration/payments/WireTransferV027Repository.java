package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV027> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV027> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV027 e").getResultList();
    }

    @Transactional
    public WireTransferV027 save(WireTransferV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV027 entity = em.find(WireTransferV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
