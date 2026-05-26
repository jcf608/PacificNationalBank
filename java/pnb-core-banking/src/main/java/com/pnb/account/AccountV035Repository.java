package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV035Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV035> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV035.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV035> findAll() {
        return em.createQuery("SELECT e FROM AccountV035 e").getResultList();
    }

    @Transactional
    public AccountV035 save(AccountV035 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV035 entity = em.find(AccountV035.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
