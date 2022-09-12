package main;

import entities.Product;

import javax.persistence.Persistence;

public class Example4 {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

        Product p = em.find(Product.class, 4); //goes to L2 cache

        //CACHE
        //evictAll - clears cache
        //evict (obj,id) - delete the object with the id
        //evict (obj) - delete all the instances + all children of the obj

        var cache = emf.getCache();
        System.out.println(cache.contains(Product.class, 4));//true or false

        //em.getTransaction().commit();
        em.close();
    }
}
