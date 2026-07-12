package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV011> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV011> findAll() {
        return em.createQuery("SELECT e FROM AccountV011 e").getResultList();
    }

    @Transactional
    public AccountV011 save(AccountV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV011 entity = em.find(AccountV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
