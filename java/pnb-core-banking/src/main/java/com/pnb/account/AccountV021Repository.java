package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV021> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV021> findAll() {
        return em.createQuery("SELECT e FROM AccountV021 e").getResultList();
    }

    @Transactional
    public AccountV021 save(AccountV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV021 entity = em.find(AccountV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
