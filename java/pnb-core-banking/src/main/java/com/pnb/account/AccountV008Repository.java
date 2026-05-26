package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV008> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV008> findAll() {
        return em.createQuery("SELECT e FROM AccountV008 e").getResultList();
    }

    @Transactional
    public AccountV008 save(AccountV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV008 entity = em.find(AccountV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
