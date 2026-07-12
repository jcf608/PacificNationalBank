package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV036> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV036> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV036 e").getResultList();
    }

    @Transactional
    public WireTransferV036 save(WireTransferV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV036 entity = em.find(WireTransferV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
