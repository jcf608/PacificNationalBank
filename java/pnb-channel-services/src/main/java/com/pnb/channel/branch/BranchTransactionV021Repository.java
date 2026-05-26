package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV021> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV021> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV021 e").getResultList();
    }

    @Transactional
    public BranchTransactionV021 save(BranchTransactionV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV021 entity = em.find(BranchTransactionV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
