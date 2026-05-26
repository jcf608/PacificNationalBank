package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV002> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV002> findAll() {
        return em.createQuery("SELECT e FROM AccountV002 e").getResultList();
    }

    @Transactional
    public AccountV002 save(AccountV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV002 entity = em.find(AccountV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
