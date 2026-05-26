package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV046Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV046> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV046.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV046> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV046 e").getResultList();
    }

    @Transactional
    public WireTransferV046 save(WireTransferV046 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV046 entity = em.find(WireTransferV046.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
