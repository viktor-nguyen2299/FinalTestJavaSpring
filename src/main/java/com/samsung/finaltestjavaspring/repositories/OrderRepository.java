package com.samsung.finaltestjavaspring.repositories;

import com.samsung.finaltestjavaspring.repositories.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
