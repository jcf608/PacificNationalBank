package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV019> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV019> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV019 e").getResultList();
    }

    @Transactional
    public BranchTransactionV019 save(BranchTransactionV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV019 entity = em.find(BranchTransactionV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
