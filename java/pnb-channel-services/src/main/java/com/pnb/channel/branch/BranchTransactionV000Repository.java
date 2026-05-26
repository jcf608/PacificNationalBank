package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV000> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV000> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV000 e").getResultList();
    }

    @Transactional
    public BranchTransactionV000 save(BranchTransactionV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV000 entity = em.find(BranchTransactionV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
