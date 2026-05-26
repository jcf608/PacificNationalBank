package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV009> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV009> findAll() {
        return em.createQuery("SELECT e FROM AccountV009 e").getResultList();
    }

    @Transactional
    public AccountV009 save(AccountV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV009 entity = em.find(AccountV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
