package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV027> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV027> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV027 e").getResultList();
    }

    @Transactional
    public BranchTransactionV027 save(BranchTransactionV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV027 entity = em.find(BranchTransactionV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
