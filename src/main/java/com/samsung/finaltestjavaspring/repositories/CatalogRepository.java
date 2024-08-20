package com.samsung.finaltestjavaspring.repositories;

import com.samsung.finaltestjavaspring.repositories.models.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CatalogRepository extends JpaRepository<Catalog, Long>{
}
