package com.subhanshu.ecommerce.service;

import com.subhanshu.ecommerce.entity.Product;
import com.subhanshu.ecommerce.exception.ProductNotFoundException;
import com.subhanshu.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Page<Product>getAllproducts(Pageable pageable){
        return productRepository.findAll(pageable);
}
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product updateProduct(Long id, Product updateProduct) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id:" + id));

        existingProduct.setName(updateProduct.getName());
        existingProduct.setPrice(updateProduct.getPrice());
        existingProduct.setStock(updateProduct.getStock());
        return productRepository.save(existingProduct);
    }

    public Product getProductBYId(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
    }

    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
