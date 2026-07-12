package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV030> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV030> findAll() {
        return em.createQuery("SELECT e FROM AccountV030 e").getResultList();
    }

    @Transactional
    public AccountV030 save(AccountV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV030 entity = em.find(AccountV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
