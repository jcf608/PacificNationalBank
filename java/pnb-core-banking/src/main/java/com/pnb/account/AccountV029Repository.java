package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV029> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV029> findAll() {
        return em.createQuery("SELECT e FROM AccountV029 e").getResultList();
    }

    @Transactional
    public AccountV029 save(AccountV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV029 entity = em.find(AccountV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
