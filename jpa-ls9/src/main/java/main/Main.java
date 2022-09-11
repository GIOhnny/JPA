package main;


import entities.*;
import enums.PhoneType;

import javax.persistence.Persistence;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

// exemplul 1
/*        Person9 p = new Person9();
        p.setName("John");
        p.setPhoneNumbers(new HashMap<>());
        p.getPhoneNumbers().put(PhoneType.MOBILE,"123");
        p.getPhoneNumbers().put(PhoneType.HOME,"123456");

        em.persist(p);*/

// exemplul 2
/*        Student9 s1 = new Student9();
        s1.setName("John");

        Professor9 p1 = new Professor9();
        p1.setName("Prof1");
        p1.setStudents(new HashMap<>());
        p1.getStudents().put("Math", s1);
        p1.getStudents().put("Astronomy", s1);

        em.persist(p1);
        em.persist(s1);*/

// exemplul 3

        Department9 d1 = new Department9();
        d1.setName("IT");

        Employee9 e1 = new Employee9();
        e1.setName("John");
        e1.setDepartment(d1);
        d1.setEmployees(new HashMap<>());
        d1.getEmployees().put(0, e1);//0 default but is not important as it is the ID

        em.persist(d1);
        em.persist(e1);

        Department9 d = em.find(Department9.class, 2);
        System.out.println(d.getEmployees());


        em.getTransaction().commit();
        em.close();
    }
}
