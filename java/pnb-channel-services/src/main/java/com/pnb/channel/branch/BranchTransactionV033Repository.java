package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV033> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV033> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV033 e").getResultList();
    }

    @Transactional
    public BranchTransactionV033 save(BranchTransactionV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV033 entity = em.find(BranchTransactionV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
