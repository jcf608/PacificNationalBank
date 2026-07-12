package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV009> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV009> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV009 e").getResultList();
    }

    @Transactional
    public WireTransferV009 save(WireTransferV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV009 entity = em.find(WireTransferV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
