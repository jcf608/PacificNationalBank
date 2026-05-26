package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV040Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV040> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV040.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV040> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV040 e").getResultList();
    }

    @Transactional
    public WireTransferV040 save(WireTransferV040 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV040 entity = em.find(WireTransferV040.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
