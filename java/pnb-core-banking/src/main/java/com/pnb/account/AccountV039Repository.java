package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV039> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV039> findAll() {
        return em.createQuery("SELECT e FROM AccountV039 e").getResultList();
    }

    @Transactional
    public AccountV039 save(AccountV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV039 entity = em.find(AccountV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
