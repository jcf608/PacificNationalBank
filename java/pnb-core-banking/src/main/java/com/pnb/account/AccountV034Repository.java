package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV034> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV034> findAll() {
        return em.createQuery("SELECT e FROM AccountV034 e").getResultList();
    }

    @Transactional
    public AccountV034 save(AccountV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV034 entity = em.find(AccountV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
