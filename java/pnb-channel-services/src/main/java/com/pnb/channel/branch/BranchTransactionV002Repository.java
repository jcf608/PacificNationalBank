package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV002> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV002> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV002 e").getResultList();
    }

    @Transactional
    public BranchTransactionV002 save(BranchTransactionV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV002 entity = em.find(BranchTransactionV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
