package main;

import entities.Company;
import entities.Event3;
import entities.Price;
import entities.Product3;
import entities.embeddables.Address;
import entities.enums.Currency;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

//*ENUM Type
/*
        Price p = new Price();

        p.setAmount(120);
        p.setCurrency(Currency.EUR);
*/
//* DATE
/*        Product3 p = new Product3();
          p.setExpDate(LocalDate.now());
          em.persist(p);*/

//* DATETIME
/*
        Event3 e = new Event3();
        e.setEventTime(ZonedDateTime.now(ZoneId.of("Europe/Paris")));
        em.persist(e);
*/

//* Embedded entities
        Company c = new Company();
        c.setName("Company1");
        c.setAddress(new Address());
        c.getAddress().setNumber("123");
        c.getAddress().setStreet("Somestreet Black");
        c.getAddress().setCity("Paris");

        em.persist(c);

        em.getTransaction().commit();
    }

}
