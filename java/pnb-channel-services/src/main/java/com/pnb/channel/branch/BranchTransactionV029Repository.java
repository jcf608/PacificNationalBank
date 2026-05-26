package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV029> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV029> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV029 e").getResultList();
    }

    @Transactional
    public BranchTransactionV029 save(BranchTransactionV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV029 entity = em.find(BranchTransactionV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
