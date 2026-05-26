package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV020> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV020> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV020 e").getResultList();
    }

    @Transactional
    public BranchTransactionV020 save(BranchTransactionV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV020 entity = em.find(BranchTransactionV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
