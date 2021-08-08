package com.whiteship;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    public void run(ApplicationArguments args) throws Exception {
        Account account =  new Account();
        account.setUsername("hyeoncheol");
        account.setPassword("jpa");

        Study study = new Study();
        study.setName("Spring Data JPA");

        account.getStudies().add(study);

        Session session = entityManager.unwrap(Session.class);
        session.save(account);
        session.save(study);

//        entityManager.persist(account);
    }
}
