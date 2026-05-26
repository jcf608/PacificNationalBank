package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV026> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV026> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV026 e").getResultList();
    }

    @Transactional
    public BranchTransactionV026 save(BranchTransactionV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV026 entity = em.find(BranchTransactionV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
