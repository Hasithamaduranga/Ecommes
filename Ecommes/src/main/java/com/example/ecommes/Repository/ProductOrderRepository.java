package com.example.ecommes.Repository;

import com.example.ecommes.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

    List<ProductOrder> findByUserId(Integer userId);
    
    ProductOrder findByOrderId(String orderId);
}
