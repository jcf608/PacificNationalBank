package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV003> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV003> findAll() {
        return em.createQuery("SELECT e FROM AccountV003 e").getResultList();
    }

    @Transactional
    public AccountV003 save(AccountV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV003 entity = em.find(AccountV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
