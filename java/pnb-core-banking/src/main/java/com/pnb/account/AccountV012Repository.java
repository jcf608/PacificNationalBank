package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV012Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV012> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV012.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV012> findAll() {
        return em.createQuery("SELECT e FROM AccountV012 e").getResultList();
    }

    @Transactional
    public AccountV012 save(AccountV012 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV012 entity = em.find(AccountV012.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
