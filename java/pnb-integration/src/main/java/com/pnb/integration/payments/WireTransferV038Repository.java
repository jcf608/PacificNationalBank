package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV038> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV038> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV038 e").getResultList();
    }

    @Transactional
    public WireTransferV038 save(WireTransferV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV038 entity = em.find(WireTransferV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
