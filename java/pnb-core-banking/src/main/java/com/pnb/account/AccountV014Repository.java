package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV014> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV014> findAll() {
        return em.createQuery("SELECT e FROM AccountV014 e").getResultList();
    }

    @Transactional
    public AccountV014 save(AccountV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV014 entity = em.find(AccountV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
