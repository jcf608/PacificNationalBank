package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV008> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV008> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV008 e").getResultList();
    }

    @Transactional
    public WireTransferV008 save(WireTransferV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV008 entity = em.find(WireTransferV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
