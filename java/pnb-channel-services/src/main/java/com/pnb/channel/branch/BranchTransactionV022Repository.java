package com.pnb.channel.branch;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class BranchTransactionV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<BranchTransactionV022> findById(Long id) {
        return Optional.ofNullable(em.find(BranchTransactionV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<BranchTransactionV022> findAll() {
        return em.createQuery("SELECT e FROM BranchTransactionV022 e").getResultList();
    }

    @Transactional
    public BranchTransactionV022 save(BranchTransactionV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        BranchTransactionV022 entity = em.find(BranchTransactionV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
