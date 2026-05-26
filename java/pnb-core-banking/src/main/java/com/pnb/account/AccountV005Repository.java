package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV005> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV005> findAll() {
        return em.createQuery("SELECT e FROM AccountV005 e").getResultList();
    }

    @Transactional
    public AccountV005 save(AccountV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV005 entity = em.find(AccountV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
