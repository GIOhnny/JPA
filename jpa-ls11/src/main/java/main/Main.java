package main;

import entities.Product;

import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory
        /* Basic operations of the entity manager
        persist() --> insert
        flush()

        find() --> select
        getReference()
        contains()

        detach()
        clear()

        remove() --> delete

        merge()
        refresh()
        */

        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

/*
        Product p = new Product();
        p.setId(12);
        p.setName("P1");
        em.persist(p); //=> persist the context of the entity
        em.flush(); // ==> forces insert into the database

        System.out.println(":)");
*/

/*
        Product p = em.find(Product.class,10); //=>triggers select by Id
        //If doesn't exist then null is returned
        System.out.println("name = "+p.getName());

        Product p2 = em.getReference(Product.class,19); //=> Lazy loading.
        // Functions as find but the select is executed only in someone really uses the data retrieved
        System.out.println("name = "+p2.getName());
*/
/*
        Product p = em.find(Product.class,10);
        System.out.println(em.contains(p)); // ==> Checks if p exists into the context true


        Product p2 = new Product();
        p2.setId(50);
        p2.setName("P2");
        System.out.println(em.contains(p2));// ==> false
*/

/*
        Product p2 = new Product();
        p2.setId(12);
        em.remove(p2); // only works on managed instances (no persist before)
*/

/*
        Product p = new Product();
        p.setId(11);
        em.merge(p); // adds in the context the detached instance

        System.out.println(em.contains(p));

        em.remove(p);
*/

/*        Product p = em.find(Product.class,11);
        p.setName("P4");//==> automatically updates the name in the DB at the commit
        em.refresh(p);*/

        Product p1 = new Product();
        p1.setName("P3");
        p1.setId(12);
        em.persist(p1);//p1 is added to the context then at the commit we have the insert

        //em.clear();//clears all the instances
        em.detach(p1);//clears the instance of the p1

        em.getTransaction().commit();
        //em.getTransaction().rollback();
        em.close();
    }
}
