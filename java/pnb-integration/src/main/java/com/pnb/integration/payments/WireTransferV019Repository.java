package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV019> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV019> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV019 e").getResultList();
    }

    @Transactional
    public WireTransferV019 save(WireTransferV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV019 entity = em.find(WireTransferV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
