package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV023> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV023> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV023 e").getResultList();
    }

    @Transactional
    public WireTransferV023 save(WireTransferV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV023 entity = em.find(WireTransferV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
