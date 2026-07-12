package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV037> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV037> findAll() {
        return em.createQuery("SELECT e FROM AccountV037 e").getResultList();
    }

    @Transactional
    public AccountV037 save(AccountV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV037 entity = em.find(AccountV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
