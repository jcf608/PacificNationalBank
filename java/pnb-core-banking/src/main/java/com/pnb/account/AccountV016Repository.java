package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV016Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV016> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV016.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV016> findAll() {
        return em.createQuery("SELECT e FROM AccountV016 e").getResultList();
    }

    @Transactional
    public AccountV016 save(AccountV016 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV016 entity = em.find(AccountV016.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
