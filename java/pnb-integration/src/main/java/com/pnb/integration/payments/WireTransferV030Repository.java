package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV030> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV030> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV030 e").getResultList();
    }

    @Transactional
    public WireTransferV030 save(WireTransferV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV030 entity = em.find(WireTransferV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
