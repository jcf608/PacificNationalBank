package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV012Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV012> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV012.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV012> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV012 e").getResultList();
    }

    @Transactional
    public WireTransferV012 save(WireTransferV012 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV012 entity = em.find(WireTransferV012.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
