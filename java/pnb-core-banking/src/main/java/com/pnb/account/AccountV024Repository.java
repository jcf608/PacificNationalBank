package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV024> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV024> findAll() {
        return em.createQuery("SELECT e FROM AccountV024 e").getResultList();
    }

    @Transactional
    public AccountV024 save(AccountV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV024 entity = em.find(AccountV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
