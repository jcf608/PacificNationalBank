package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV035Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV035> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV035.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV035> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV035 e").getResultList();
    }

    @Transactional
    public WireTransferV035 save(WireTransferV035 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV035 entity = em.find(WireTransferV035.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
