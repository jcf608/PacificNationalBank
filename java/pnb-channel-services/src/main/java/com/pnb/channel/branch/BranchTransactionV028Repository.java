package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV028> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV028> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV028 e").getResultList();
    }

    @Transactional
    public BranchTransactionV028 save(BranchTransactionV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV028 entity = em.find(BranchTransactionV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
