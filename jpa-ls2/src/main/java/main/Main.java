package main;

import entities.Event;
import entities.Product;

import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        var em2 = emf.createEntityManager();

        Product p = new Product();
        p.setName("Bere");

        try {
            em.getTransaction().begin();
            em.persist(p); //adding the instance in the context
            em.getTransaction().commit();
        } catch (Exception e) {
           em.getTransaction().rollback();
        } finally {
            em.close();
        }

        Event e = new Event();
        e.setDescription("aaa");

        em2.getTransaction().begin();
        em2.persist(e); //adding the instance in the context
        em2.getTransaction().commit();
        em2.close();
    }
}
