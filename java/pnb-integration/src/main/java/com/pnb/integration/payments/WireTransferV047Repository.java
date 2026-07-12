package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV047Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV047> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV047.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV047> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV047 e").getResultList();
    }

    @Transactional
    public WireTransferV047 save(WireTransferV047 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV047 entity = em.find(WireTransferV047.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
