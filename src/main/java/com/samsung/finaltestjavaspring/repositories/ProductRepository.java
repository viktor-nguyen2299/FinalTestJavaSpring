package com.samsung.finaltestjavaspring.repositories;

import com.samsung.finaltestjavaspring.repositories.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {
}
