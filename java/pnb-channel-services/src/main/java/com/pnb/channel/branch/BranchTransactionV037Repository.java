package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV037> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV037> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV037 e").getResultList();
    }

    @Transactional
    public BranchTransactionV037 save(BranchTransactionV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV037 entity = em.find(BranchTransactionV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
