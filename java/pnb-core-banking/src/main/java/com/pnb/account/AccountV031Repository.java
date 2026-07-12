package com.pnb.account;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AccountV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AccountV031> findById(Long id) {
        return Optional.ofNullable(em.find(AccountV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AccountV031> findAll() {
        return em.createQuery("SELECT e FROM AccountV031 e").getResultList();
    }

    @Transactional
    public AccountV031 save(AccountV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AccountV031 entity = em.find(AccountV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
