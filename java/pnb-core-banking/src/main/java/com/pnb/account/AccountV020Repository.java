package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV020> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV020> findAll() {
        return em.createQuery("SELECT e FROM AccountV020 e").getResultList();
    }

    @Transactional
    public AccountV020 save(AccountV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV020 entity = em.find(AccountV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
