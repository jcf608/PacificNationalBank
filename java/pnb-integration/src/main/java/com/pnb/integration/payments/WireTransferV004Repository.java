package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV004> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV004> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV004 e").getResultList();
    }

    @Transactional
    public WireTransferV004 save(WireTransferV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV004 entity = em.find(WireTransferV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
