package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV038> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV038> findAll() {
        return em.createQuery("SELECT e FROM AccountV038 e").getResultList();
    }

    @Transactional
    public AccountV038 save(AccountV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV038 entity = em.find(AccountV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
