package com.samsung.finaltestjavaspring.repositories;

import com.samsung.finaltestjavaspring.repositories.models.Catalogs;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CatalogRepository extends JpaRepository<Catalogs, Long>{
}
