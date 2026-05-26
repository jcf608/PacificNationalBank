package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV041Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV041> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV041.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV041> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV041 e").getResultList();
    }

    @Transactional
    public WireTransferV041 save(WireTransferV041 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV041 entity = em.find(WireTransferV041.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
