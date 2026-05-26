package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV006Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV006> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV006.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV006> findAll() {
        return em.createQuery("SELECT e FROM AccountV006 e").getResultList();
    }

    @Transactional
    public AccountV006 save(AccountV006 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV006 entity = em.find(AccountV006.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
