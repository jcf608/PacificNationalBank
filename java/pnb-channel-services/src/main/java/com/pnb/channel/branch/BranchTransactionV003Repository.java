package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV003> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV003> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV003 e").getResultList();
    }

    @Transactional
    public BranchTransactionV003 save(BranchTransactionV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV003 entity = em.find(BranchTransactionV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
