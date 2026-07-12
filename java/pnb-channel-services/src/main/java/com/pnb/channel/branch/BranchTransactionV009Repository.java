package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV009> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV009> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV009 e").getResultList();
    }

    @Transactional
    public BranchTransactionV009 save(BranchTransactionV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV009 entity = em.find(BranchTransactionV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
