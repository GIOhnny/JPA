package main;

import main.embeddables.BuildingPk;
import main.entities.Building;
import main.entities.Department;
import main.entities.Person;

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
        Company4 c = new Company4();
        c.setName("Company1");
        c.setAddress(new Address());
        c.getAddress().setNo("123");
        c.getAddress().setStr("Somestreet White");
        c.getAddress().setCity("London");
        em.persist(c);
 */

/*
        Department d = new Department();
        d.setName("Department1");
        d.setCode("123");
        d.setNo(100);
        em.persist(d);
*/
/*        Building b = new Building();
        b.setName("Department1");
        b.setId(new BuildingPk());
        b.getId().setCode("ABC");
        b.getId().setNumber(10);
        em.persist(b);*/

        Person p = new Person();
        p.setName("Person1");
        em.persist(p);

        em.getTransaction().commit();
    }

}
