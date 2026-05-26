package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV031> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV031> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV031 e").getResultList();
    }

    @Transactional
    public WireTransferV031 save(WireTransferV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV031 entity = em.find(WireTransferV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
