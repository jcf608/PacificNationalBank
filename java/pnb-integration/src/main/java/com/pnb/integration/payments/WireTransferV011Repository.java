package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV011> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV011> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV011 e").getResultList();
    }

    @Transactional
    public WireTransferV011 save(WireTransferV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV011 entity = em.find(WireTransferV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
