package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV022> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV022> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV022 e").getResultList();
    }

    @Transactional
    public WireTransferV022 save(WireTransferV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV022 entity = em.find(WireTransferV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
