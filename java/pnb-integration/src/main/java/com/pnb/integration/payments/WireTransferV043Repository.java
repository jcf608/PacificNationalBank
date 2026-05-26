package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV043Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV043> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV043.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV043> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV043 e").getResultList();
    }

    @Transactional
    public WireTransferV043 save(WireTransferV043 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV043 entity = em.find(WireTransferV043.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
