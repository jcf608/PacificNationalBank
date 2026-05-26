package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV001> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV001> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV001 e").getResultList();
    }

    @Transactional
    public BranchTransactionV001 save(BranchTransactionV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV001 entity = em.find(BranchTransactionV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
