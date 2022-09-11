package main;


import entities.*;

import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

/*        Animal a = new Animal();
        a.setName("Dog");

        Cat c= new Cat();
        c.setName("Cat");
        c.setColor("black");

        em.persist(a);
        em.persist(c);*/

/*        Product p = new Product();
        p.setName("P");

        Chocolate c = new Chocolate();
        c.setName("C");
        c.setKcal(50);

        em.persist(p);
        em.persist(c);*/

/*        Employee e = new Employee();
        e.setId(1);
        e.setName("E");

        Manager manager = new Manager();
        manager.setId(2);
        manager.setName("M");
        manager.setResponsibility("Manager");

        em.persist(e);
        em.persist(manager);*/

        Car c = new Car();
        c.setColor("red");
        c.setGas("diesel");

        Bicycle b = new Bicycle();
        b.setColor("blue");
        b.setModel("m");

        em.persist(c);
        em.persist(b);

        em.getTransaction().commit();
        em.close();
    }
}
