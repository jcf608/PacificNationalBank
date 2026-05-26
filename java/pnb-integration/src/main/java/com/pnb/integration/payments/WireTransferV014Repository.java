package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV014> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV014> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV014 e").getResultList();
    }

    @Transactional
    public WireTransferV014 save(WireTransferV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV014 entity = em.find(WireTransferV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
