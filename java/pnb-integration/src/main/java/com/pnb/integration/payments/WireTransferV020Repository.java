package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV020> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV020> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV020 e").getResultList();
    }

    @Transactional
    public WireTransferV020 save(WireTransferV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV020 entity = em.find(WireTransferV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
