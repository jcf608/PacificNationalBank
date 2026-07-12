package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV036> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV036> findAll() {
        return em.createQuery("SELECT e FROM AccountV036 e").getResultList();
    }

    @Transactional
    public AccountV036 save(AccountV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV036 entity = em.find(AccountV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
