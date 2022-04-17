package com.chaining;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExampleMain2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeDb");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        ClassA a = new ClassA();
        a.setMyInt(10);
        a.setMyStr("a test String");

        ClassB b = new ClassB();
        b.setMyStrB("a test string in ClassB");
        b.setClassARef(a);

        MyEntity entityB = new MyEntity();
        entityB.setClassBRef(b);

        em.persist(entityB);
        tx.commit();
        em.close();

    }
}
