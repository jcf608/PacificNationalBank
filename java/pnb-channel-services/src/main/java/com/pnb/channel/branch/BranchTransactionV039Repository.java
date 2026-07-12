package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV039> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV039> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV039 e").getResultList();
    }

    @Transactional
    public BranchTransactionV039 save(BranchTransactionV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV039 entity = em.find(BranchTransactionV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
