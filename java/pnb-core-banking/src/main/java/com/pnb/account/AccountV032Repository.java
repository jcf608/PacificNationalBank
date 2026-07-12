package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV032> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV032> findAll() {
        return em.createQuery("SELECT e FROM AccountV032 e").getResultList();
    }

    @Transactional
    public AccountV032 save(AccountV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV032 entity = em.find(AccountV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
