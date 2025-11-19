package com.cflaski.eshop.repository;

import com.cflaski.eshop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(String uuid);
    List<Order> findByUserEmail(String email);
    Optional<Order> findByOrderId(Long id);
}
