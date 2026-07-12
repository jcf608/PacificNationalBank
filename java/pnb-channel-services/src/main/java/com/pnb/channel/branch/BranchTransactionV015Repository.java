package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV015> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV015> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV015 e").getResultList();
    }

    @Transactional
    public BranchTransactionV015 save(BranchTransactionV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV015 entity = em.find(BranchTransactionV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
