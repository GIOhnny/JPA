package ro.giohnnysoftware.jpals13spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ro.giohnnysoftware.jpals13spring.entities.Product;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE p.name like :name")
    List<Product> findProductsByName(String name);
}
