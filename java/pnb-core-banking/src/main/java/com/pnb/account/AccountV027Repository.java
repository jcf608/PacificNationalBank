package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV027> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV027> findAll() {
        return em.createQuery("SELECT e FROM AccountV027 e").getResultList();
    }

    @Transactional
    public AccountV027 save(AccountV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV027 entity = em.find(AccountV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
