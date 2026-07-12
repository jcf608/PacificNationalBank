package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV000> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV000> findAll() {
        return em.createQuery("SELECT e FROM AccountV000 e").getResultList();
    }

    @Transactional
    public AccountV000 save(AccountV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV000 entity = em.find(AccountV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
