package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV004> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV004> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV004 e").getResultList();
    }

    @Transactional
    public BranchTransactionV004 save(BranchTransactionV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV004 entity = em.find(BranchTransactionV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
