package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV028> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV028> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV028 e").getResultList();
    }

    @Transactional
    public WireTransferV028 save(WireTransferV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV028 entity = em.find(WireTransferV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
