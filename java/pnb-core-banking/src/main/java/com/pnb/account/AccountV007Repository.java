package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV007> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV007> findAll() {
        return em.createQuery("SELECT e FROM AccountV007 e").getResultList();
    }

    @Transactional
    public AccountV007 save(AccountV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV007 entity = em.find(AccountV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
