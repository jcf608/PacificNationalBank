package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV034> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV034> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV034 e").getResultList();
    }

    @Transactional
    public WireTransferV034 save(WireTransferV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV034 entity = em.find(WireTransferV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
