package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV017> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV017> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV017 e").getResultList();
    }

    @Transactional
    public WireTransferV017 save(WireTransferV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV017 entity = em.find(WireTransferV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
