package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV004> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV004> findAll() {
        return em.createQuery("SELECT e FROM AccountV004 e").getResultList();
    }

    @Transactional
    public AccountV004 save(AccountV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV004 entity = em.find(AccountV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
