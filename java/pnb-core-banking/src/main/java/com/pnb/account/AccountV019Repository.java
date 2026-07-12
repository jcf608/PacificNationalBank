package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV019> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV019> findAll() {
        return em.createQuery("SELECT e FROM AccountV019 e").getResultList();
    }

    @Transactional
    public AccountV019 save(AccountV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV019 entity = em.find(AccountV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
