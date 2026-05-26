package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV013Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV013> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV013.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV013> findAll() {
        return em.createQuery("SELECT e FROM AccountV013 e").getResultList();
    }

    @Transactional
    public AccountV013 save(AccountV013 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV013 entity = em.find(AccountV013.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
