package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV045Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV045> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV045.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV045> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV045 e").getResultList();
    }

    @Transactional
    public WireTransferV045 save(WireTransferV045 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV045 entity = em.find(WireTransferV045.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
