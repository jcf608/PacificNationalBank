package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV031> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV031> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV031 e").getResultList();
    }

    @Transactional
    public BranchTransactionV031 save(BranchTransactionV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV031 entity = em.find(BranchTransactionV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
