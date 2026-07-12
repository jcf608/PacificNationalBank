package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV008> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV008> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV008 e").getResultList();
    }

    @Transactional
    public BranchTransactionV008 save(BranchTransactionV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV008 entity = em.find(BranchTransactionV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
