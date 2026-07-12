package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV033> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV033> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV033 e").getResultList();
    }

    @Transactional
    public WireTransferV033 save(WireTransferV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV033 entity = em.find(WireTransferV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
