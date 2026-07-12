package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV001> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV001> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV001 e").getResultList();
    }

    @Transactional
    public WireTransferV001 save(WireTransferV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV001 entity = em.find(WireTransferV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
