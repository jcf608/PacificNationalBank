package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV015> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV015> findAll() {
        return em.createQuery("SELECT e FROM AccountV015 e").getResultList();
    }

    @Transactional
    public AccountV015 save(AccountV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV015 entity = em.find(AccountV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
