package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV038> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV038> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV038 e").getResultList();
    }

    @Transactional
    public BranchTransactionV038 save(BranchTransactionV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV038 entity = em.find(BranchTransactionV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
