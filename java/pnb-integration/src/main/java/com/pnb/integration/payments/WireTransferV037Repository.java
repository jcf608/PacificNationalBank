package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV037> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV037> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV037 e").getResultList();
    }

    @Transactional
    public WireTransferV037 save(WireTransferV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV037 entity = em.find(WireTransferV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
