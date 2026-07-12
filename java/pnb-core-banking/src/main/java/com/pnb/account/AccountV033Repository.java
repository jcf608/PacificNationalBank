package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV033> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV033> findAll() {
        return em.createQuery("SELECT e FROM AccountV033 e").getResultList();
    }

    @Transactional
    public AccountV033 save(AccountV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV033 entity = em.find(AccountV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
