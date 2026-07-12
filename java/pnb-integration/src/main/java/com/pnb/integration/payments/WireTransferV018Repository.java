package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV018> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV018> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV018 e").getResultList();
    }

    @Transactional
    public WireTransferV018 save(WireTransferV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV018 entity = em.find(WireTransferV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
