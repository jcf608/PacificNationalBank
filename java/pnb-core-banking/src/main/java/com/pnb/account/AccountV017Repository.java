package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV017> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV017> findAll() {
        return em.createQuery("SELECT e FROM AccountV017 e").getResultList();
    }

    @Transactional
    public AccountV017 save(AccountV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV017 entity = em.find(AccountV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
