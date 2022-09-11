package main;

import entities.*;

import javax.persistence.Persistence;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory

        var emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

/* Part 1
        Department d = new Department();
        d.setName("Department2");

        DepartmentDetails dd = new DepartmentDetails();
        dd.setDepartment(d);
        dd.setContractNo("DepartmentContract2");

        Employee e = new Employee();
        e.setName("Ion");
        e.setDepartmentDetails(dd);

        em.persist(e);
        em.persist(d);
*/

/*
        Professor8 p = new Professor8();
        p.setName("P1");

        ProfessorDetails pd = new ProfessorDetails();
        pd.setProfessors(Arrays.asList(p));

        Student8 s= new Student8();
        s.setName("Student1");
        s.setProfessorDetails(pd);

        em.persist(p);
        em.persist(s);
*/

        Document8 d = new Document8();
        d.setNumber("1111");
        d.setReference("dsasasdsad");

        Person8 p = new Person8();
        p.setName("Dorel");
        p.setPhoneNumbers(Arrays.asList("123", "456", "3312"));
        p.setDocuments(Arrays.asList(d));
        em.persist(p);


        em.getTransaction().commit();
        em.close();
    }
}
