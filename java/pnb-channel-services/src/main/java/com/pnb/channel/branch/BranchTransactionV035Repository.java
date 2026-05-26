package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV035Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV035> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV035.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV035> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV035 e").getResultList();
    }

    @Transactional
    public BranchTransactionV035 save(BranchTransactionV035 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV035 entity = em.find(BranchTransactionV035.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
