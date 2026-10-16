package com.codealpha.ecommerce.repository;

import com.codealpha.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<Product,Long> {
}
