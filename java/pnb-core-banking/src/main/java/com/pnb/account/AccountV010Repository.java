package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV010> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV010> findAll() {
        return em.createQuery("SELECT e FROM AccountV010 e").getResultList();
    }

    @Transactional
    public AccountV010 save(AccountV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV010 entity = em.find(AccountV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
