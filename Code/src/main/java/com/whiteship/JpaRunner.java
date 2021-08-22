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
        Post post = new Post();
        post.setTitle("Spring Data JAP 언제 보나...");

        Comment comment = new Comment();
        comment.setComment("빨리 보고 싶어요");
        post.addComment(comment);

        Comment comment1 = new Comment();
        comment1.setComment("곧 보여드릴게요");
        post.addComment(comment1);

        Session session = entityManager.unwrap(Session.class);
        session.save(post);


        //        Account account =  new Account();
//        account.setUsername("hyeoncheol");
//        account.setPassword("jpa");
//
//        Study study = new Study();
//        study.setName("Spring Data JPA");
//
//        account.getStudies().add(study);
//
//        Session session = entityManager.unwrap(Session.class);
//        session.save(account);
//        session.save(study);
//
////        entityManager.persist(account);
//
//        Account hyeoncheol = session.load(Account.class,account.getId());
//        System.out.println("===========");
//        System.out.println(hyeoncheol.getUsername());
    }
}
