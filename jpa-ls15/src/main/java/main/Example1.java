package main;

import entities.Product;

import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

        String jpql = "SELECT p FROM Product p";

        TypedQuery<Product> q = em.createQuery(jpql, Product.class);
        List<Product> result = q.getResultList();

        result.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
    }
}
