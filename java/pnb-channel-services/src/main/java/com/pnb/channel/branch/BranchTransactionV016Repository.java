package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV016Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV016> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV016.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV016> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV016 e").getResultList();
    }

    @Transactional
    public BranchTransactionV016 save(BranchTransactionV016 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV016 entity = em.find(BranchTransactionV016.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
