package com.study;

import org.hibernate.Transaction;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MemberTests {
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory(){
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");//persistence에 있는걸 불러온다.
    }

    @BeforeEach
    public void initManager(){
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterEach
    public void closeManager(){
        entityManager.close();
    }


    @AfterAll
    public static void closeFactory(){
        entityManagerFactory.close();
    }

    @Test
    void 회원_테스트(){

        Member member = new Member();
        member.setMemberNo(1);
        member.setMemberName("병훈");
        member.setMemberNick("공룡");
        member.setPhone("010-0709-0709");
        member.setZipCode("3231");
        member.setGeneralAddress("경기도");
        member.setAddress("고양시");
        member.setMembrerRole(RoleType.MEMBER);
        member.setStatus("Y");

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(member);

        try{
            entityTransaction.commit();
        }catch (Exception e){
            entityTransaction.rollback();
            e.printStackTrace();
        }

        Member findMember = entityManager.find(Member.class, 1);
        Assertions.assertEquals(member.getMemberNo(), findMember.getMemberNo());
    }

}
