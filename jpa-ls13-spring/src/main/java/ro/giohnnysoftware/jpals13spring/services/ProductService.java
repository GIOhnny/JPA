package ro.giohnnysoftware.jpals13spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.giohnnysoftware.jpals13spring.entities.Product;
import ro.giohnnysoftware.jpals13spring.repositories.ProductRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(String name) {
        Product p = new Product();
        p.setName(name);
        productRepository.save(p);
    }

    public List<Product> findProducts(){
        return productRepository.findAll();
    }
}
