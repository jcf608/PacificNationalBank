package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV018> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV018> findAll() {
        return em.createQuery("SELECT e FROM AccountV018 e").getResultList();
    }

    @Transactional
    public AccountV018 save(AccountV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV018 entity = em.find(AccountV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
