package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV005> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV005> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV005 e").getResultList();
    }

    @Transactional
    public BranchTransactionV005 save(BranchTransactionV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV005 entity = em.find(BranchTransactionV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
