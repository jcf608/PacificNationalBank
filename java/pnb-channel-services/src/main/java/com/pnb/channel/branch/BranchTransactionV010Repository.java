package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV010> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV010> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV010 e").getResultList();
    }

    @Transactional
    public BranchTransactionV010 save(BranchTransactionV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV010 entity = em.find(BranchTransactionV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
