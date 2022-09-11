package main;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactoru

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        EntityManager em = emf.createEntityManager();

        Product p = new Product();
        p.setId(101);
        p.setName("Bere");
        p.setPrice(10.4);
        p.setExpirationDate(LocalDate.now().plusDays(5));

        try {
            em.getTransaction().begin();
            em.persist(p); //adding the instance in the context
            em.getTransaction().commit();
        } catch (Exception e) {
           em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
