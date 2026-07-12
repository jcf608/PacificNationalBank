package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV014> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV014> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV014 e").getResultList();
    }

    @Transactional
    public BranchTransactionV014 save(BranchTransactionV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV014 entity = em.find(BranchTransactionV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
