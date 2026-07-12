package com.pnb.integration.payments;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class WireTransferV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<WireTransferV002> findById(Long id) {
        return Optional.ofNullable(em.find(WireTransferV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<WireTransferV002> findAll() {
        return em.createQuery("SELECT e FROM WireTransferV002 e").getResultList();
    }

    @Transactional
    public WireTransferV002 save(WireTransferV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        WireTransferV002 entity = em.find(WireTransferV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
