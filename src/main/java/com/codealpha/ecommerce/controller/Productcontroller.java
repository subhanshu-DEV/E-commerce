
package com.codealpha.ecommerce.controller;

import com.codealpha.ecommerce.entity.Product;
import com.codealpha.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class Productcontroller {

    private final ProductService productService;

    public Productcontroller(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product addProduct(@Valid @RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
        return productService.updateProduct(id,product);
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return  productService.getProductBYId(id);
    }
}
