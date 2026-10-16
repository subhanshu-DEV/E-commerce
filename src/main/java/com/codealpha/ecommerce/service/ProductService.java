
package com.codealpha.ecommerce.service;

import com.codealpha.ecommerce.entity.Product;
import com.codealpha.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
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

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
public Product updateProduct(Long id,Product updateProduct){
      Product existingProduct= productRepository.findById(id)
              .orElseThrow(() ->new RuntimeException("Product not found with id:" + id));

      existingProduct.setName(updateProduct.getName());
      existingProduct.setPrice(updateProduct.getPrice());
      existingProduct.setStock(updateProduct.getStock());
      return  productRepository.save(existingProduct);
}
public Product getProductBYId(Long id){
        return productRepository.findById(id).
                orElseThrow(() ->new RuntimeException("Product not found with id:" +id));
}
}
