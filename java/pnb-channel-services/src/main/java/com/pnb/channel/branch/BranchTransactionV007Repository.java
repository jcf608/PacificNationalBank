package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV007> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV007> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV007 e").getResultList();
    }

    @Transactional
    public BranchTransactionV007 save(BranchTransactionV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV007 entity = em.find(BranchTransactionV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
