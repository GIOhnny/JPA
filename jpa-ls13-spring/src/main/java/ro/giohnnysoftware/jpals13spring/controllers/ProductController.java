package ro.giohnnysoftware.jpals13spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.giohnnysoftware.jpals13spring.entities.Product;
import ro.giohnnysoftware.jpals13spring.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add/{name}")
    public void addProduct(@PathVariable("name") String name) {
        productService.addProduct(name);
    }

    @GetMapping("/get")
    public List<Product> findProducts() {
        return productService.findProducts();
    }

}
