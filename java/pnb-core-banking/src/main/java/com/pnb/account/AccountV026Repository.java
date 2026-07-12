package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV026> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV026> findAll() {
        return em.createQuery("SELECT e FROM AccountV026 e").getResultList();
    }

    @Transactional
    public AccountV026 save(AccountV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV026 entity = em.find(AccountV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
