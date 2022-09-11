package main;

import entities.Employee;
import entities.Product;

import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main {
    /*
    SQL - select * from product p (native queries)
    JPQL - SELECT p FROM Product p (abstract level of SQL)
     */

    public static void main(String[] args) {
        //EntityManager
        //EntityManageFactory
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();
        em.getTransaction().begin();

/*
        String jpql = "SELECT p FROM Product p";
        TypedQuery<Product> q = em.createQuery(jpql, Product.class);
*/


/*        String jpql = "SELECT p FROM Product p WHERE p.price > :price";
        TypedQuery<Product> q = em.createQuery(jpql, Product.class);
        q.setParameter("price", 10d);//or //10.0

        List<Product> list = q.getResultList();
        list.forEach(System.out::println);*/

/*
        String jpql = "SELECT p FROM Product p WHERE p.price > ?1";
        TypedQuery<Product> q = em.createQuery(jpql, Product.class);
        q.setParameter(1, 10d);//or //10.0

        List<Product> list = q.getResultList();
        list.forEach(System.out::println);
*/

/*      String jpql = "SELECT sum(p.price) FROM Product p WHERE p.price > :price";
        TypedQuery<Double> q = em.createQuery(jpql, Double.class);
        q.setParameter("price", 10d);//or //10.0

        double sum = q.getSingleResult();
        System.out.println(sum);*/

/*        TypedQuery<Product> q = em.createNamedQuery("Product.all", Product.class);
        q.getResultStream()
                .filter(p->p.getPrice() > 10d)
                .forEach(System.out::println);*/

/*        String sql = "SELECT * FROM product p";
        Query q = em.createNativeQuery(sql, Product.class);
        List<Product> products = q.getResultList();
        products.forEach(System.out::println);*/

        String jpql = "SELECT e FROM Employee e, Department d WHERE e.department = d AND d.id = :id";
        TypedQuery<Employee> q = em.createQuery(jpql, Employee.class);
        q.setParameter("id",1);
        List<Employee> list = q.getResultList();

        list.forEach(System.out::println);

        em.getTransaction().commit();
        //em.getTransaction().rollback();
        em.close();
    }
}
