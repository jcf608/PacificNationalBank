package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV025> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV025> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV025 e").getResultList();
    }

    @Transactional
    public BranchTransactionV025 save(BranchTransactionV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV025 entity = em.find(BranchTransactionV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
