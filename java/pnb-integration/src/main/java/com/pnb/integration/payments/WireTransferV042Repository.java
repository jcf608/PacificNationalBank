package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV042Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV042> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV042.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV042> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV042 e").getResultList();
    }

    @Transactional
    public WireTransferV042 save(WireTransferV042 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV042 entity = em.find(WireTransferV042.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
