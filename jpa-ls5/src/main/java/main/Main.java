package main;

import entities.Details5;
import entities.Product5;

import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

/*
        Company c = new Company();
        c.setName("My Company");
        c.setStreet("123 Main St");
        c.setNumber("A456");
        c.setDetails("aswguioasndvsainooidawn");

        em.persist(c);
*/

        Product5 p = new Product5();
        p.setName("My Product 1");
        p.setPrice(11.34);

        Details5 d =new Details5();
        d.setKcal(12);
        d.setProduct5(p);
        p.setDetail(d);

        em.persist(d);

        em.getTransaction().commit();
    }

}
