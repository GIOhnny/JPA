package main;

import entities.Professor;
import entities.Student;

import javax.persistence.Persistence;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();


        Professor p = new Professor();
        p.setName("Dorel");

        Student s1 = new Student();
        s1.setName("S1");

        p.setStudents(new ArrayList<>());
        p.getStudents().add(s1);

        s1.setProfessors(new ArrayList<>());
        s1.getProfessors().add(p);

        em.persist(p);
        em.persist(s1);

        em.getTransaction().commit();
        em.close();
    }
}
