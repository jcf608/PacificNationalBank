package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV028> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV028> findAll() {
        return em.createQuery("SELECT e FROM AccountV028 e").getResultList();
    }

    @Transactional
    public AccountV028 save(AccountV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV028 entity = em.find(AccountV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
