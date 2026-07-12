package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV032> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV032> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV032 e").getResultList();
    }

    @Transactional
    public BranchTransactionV032 save(BranchTransactionV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV032 entity = em.find(BranchTransactionV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
