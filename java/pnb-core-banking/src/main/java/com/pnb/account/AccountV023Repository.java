package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV023> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV023> findAll() {
        return em.createQuery("SELECT e FROM AccountV023 e").getResultList();
    }

    @Transactional
    public AccountV023 save(AccountV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV023 entity = em.find(AccountV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
