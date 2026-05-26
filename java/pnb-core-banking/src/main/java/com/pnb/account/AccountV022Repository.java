package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV022> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV022> findAll() {
        return em.createQuery("SELECT e FROM AccountV022 e").getResultList();
    }

    @Transactional
    public AccountV022 save(AccountV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV022 entity = em.find(AccountV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
