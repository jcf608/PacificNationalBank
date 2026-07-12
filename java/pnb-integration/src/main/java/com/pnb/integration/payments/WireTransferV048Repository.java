package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV048Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV048> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV048.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV048> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV048 e").getResultList();
    }

    @Transactional
    public WireTransferV048 save(WireTransferV048 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV048 entity = em.find(WireTransferV048.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
