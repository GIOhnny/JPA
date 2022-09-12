package main;

import entities.Product;

import javax.persistence.Persistence;

public class Example2 {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

        Product p = em.find(Product.class, 3);
        p.setName("Product 2");
        em.persist(p);

        em.getTransaction().commit();
        em.close();
    }
}