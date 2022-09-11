package main;

import entities.Department6;
import entities.Document6;
import entities.Employee6;
import entities.Person6;

import javax.persistence.Persistence;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

/*        Employee6 e = new Employee6();
        e.setName("John");

        Department6 d = new Department6();
        d.setName("Dep1");
        d.setEmployees(new ArrayList<>());
        d.getEmployees().add(e);

        em.persist(e);
        em.persist(d);*/

        Person6 p1 = new Person6();
        p1.setName("P1");
        p1.setDocuments(new ArrayList<>());

        Document6 d1 = new Document6();
        d1.setName("DOC 1");

        d1.setPerson6(p1);
        p1.getDocuments().add(d1);

        //em.persist(p1);
        em.persist(d1);

        em.getTransaction().commit();
    }

}
