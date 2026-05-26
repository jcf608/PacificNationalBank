package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV039> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV039> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV039 e").getResultList();
    }

    @Transactional
    public WireTransferV039 save(WireTransferV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV039 entity = em.find(WireTransferV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
