package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV013Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV013> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV013.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV013> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV013 e").getResultList();
    }

    @Transactional
    public BranchTransactionV013 save(BranchTransactionV013 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV013 entity = em.find(BranchTransactionV013.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
