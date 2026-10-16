package com.subhanshu.ecommerce.repository;

import com.subhanshu.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<Product,Long> {
}
