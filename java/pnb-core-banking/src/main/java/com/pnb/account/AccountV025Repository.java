package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV025> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV025> findAll() {
        return em.createQuery("SELECT e FROM AccountV025 e").getResultList();
    }

    @Transactional
    public AccountV025 save(AccountV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV025 entity = em.find(AccountV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
