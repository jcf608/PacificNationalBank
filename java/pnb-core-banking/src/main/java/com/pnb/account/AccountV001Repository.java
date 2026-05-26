package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV001> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV001> findAll() {
        return em.createQuery("SELECT e FROM AccountV001 e").getResultList();
    }

    @Transactional
    public AccountV001 save(AccountV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV001 entity = em.find(AccountV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
