package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV021> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV021> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV021 e").getResultList();
    }

    @Transactional
    public WireTransferV021 save(WireTransferV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV021 entity = em.find(WireTransferV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
