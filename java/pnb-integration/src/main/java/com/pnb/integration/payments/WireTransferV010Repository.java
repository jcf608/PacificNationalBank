package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV010> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV010> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV010 e").getResultList();
    }

    @Transactional
    public WireTransferV010 save(WireTransferV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV010 entity = em.find(WireTransferV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
